package com.nkassociates.mytown;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import uk.co.senab.photoview.PhotoViewAttacher;

public class PlaceDetailsActivity extends AppCompatActivity {

    //Declare inside class.
    ImageView imageView;
    TextView tvName, tvLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);

        //Bind inside onCreate().
        imageView = (ImageView) findViewById(R.id.imageView);
        tvName = (TextView) findViewById(R.id.tvName);
        tvLocation = (TextView) findViewById(R.id.tvLocation);

        //Home Button
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();
        final String name = i.getStringExtra("name");
        final String location = i.getStringExtra("location");
        final String imageLink = i.getStringExtra("image");

        Picasso.with(PlaceDetailsActivity.this).load(imageLink).into(imageView);
        PhotoViewAttacher photoAttacher;
        photoAttacher = new PhotoViewAttacher(imageView);
        photoAttacher.update();
        tvName.setText(name);
        tvLocation.setText(location);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(PlaceDetailsActivity.this, TownInfo.class);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
