package com.nkassociates.mytown;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TownInfo extends AppCompatActivity {

    //Declare inside class
    String location, subcategory;
    Firebase firebase;
    private List<ListItem2> listItems;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_town_info);

        //Bind inside onCreate().
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Saving 100's of Activities using this.
        Intent i = getIntent();
        location = i.getStringExtra("location");

        //Home Button
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        //Locked orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        listItems = new ArrayList<>();

        adapter = new MyAdapter2(listItems, this);

        recyclerView.setAdapter(adapter);

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (!(networkInfo != null && networkInfo.isConnected())) {
            Toast.makeText(this, "Please connect to the internet", Toast.LENGTH_SHORT).show();
        } else {

            firebase = new Firebase("https://mytown-d309b.firebaseio.com/" + location + "/places/");

            final ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setTitle("Downloading");
            progressDialog.setMessage("Please wait...");
            progressDialog.show();
            //progressDialog.setCancelable(false);

            firebase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    for (DataSnapshot child : dataSnapshot.getChildren()) {
                        Map<String, String> map = child.getValue(Map.class);
                        String name = map.get("name");
                        String imageLink = map.get("image");
                        String location = map.get("location");
                        String Button = map.get("button");
                        //Toast.makeText(DescriptionActivity.this, "Name: " + name + "\nLocation: " + location + "\nImage Link: " + imageLink, Toast.LENGTH_SHORT).show();
                        ListItem2 listItem = new ListItem2(name, location, imageLink, Button);
                        listItems.add(listItem);
                        //This is to notify changes to RecyclerView. Otherwise, we will have to restart the Activity.
                        adapter.notifyDataSetChanged();
                        progressDialog.cancel();
                    }
                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {

                }
            });
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(TownInfo.this, DetailsActivity.class);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
