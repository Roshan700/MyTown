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
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class DescriptionActivity extends AppCompatActivity {

    //Declare inside class
    String location, subcategory;
    Firebase firebase;
    private List<ListItem> listItems;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        //Bind inside onCreate().
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Saving 100's of Activities using this.
        Intent i = getIntent();
        location = i.getStringExtra("location");
        subcategory = i.getStringExtra("subcategory");

        //Home Button
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        //Locked orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        listItems = new ArrayList<>();

        adapter = new MyAdapter(listItems, this);

        recyclerView.setAdapter(adapter);

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (!(networkInfo != null && networkInfo.isConnected())) {
            Toast.makeText(this, "Please connect to the internet", Toast.LENGTH_SHORT).show();
        } else {

            firebase = new Firebase("https://mytown-d309b.firebaseio.com/" + location + "/" + subcategory);

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
                        //Will be changed according to data provided later.
                        String name = map.get("name");
                        String imageLink = map.get("image");
                        String location = map.get("location");
                        String contact = map.get("contact");
                        String website = map.get("website");
                        String address = map.get("address");
                        //Toast.makeText(DescriptionActivity.this, "Name: " + name + "\nLocation: " + location + "\nImage Link: " + imageLink, Toast.LENGTH_SHORT).show();
                        ListItem listItem = new ListItem(name, location, imageLink, contact, website, address);
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
            Intent i = new Intent(DescriptionActivity.this, SubCategoryActivity.class);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
