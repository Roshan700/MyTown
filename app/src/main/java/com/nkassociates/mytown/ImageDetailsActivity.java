package com.nkassociates.mytown;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class ImageDetailsActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_details);

        //Bind inside onCreate().
        imageView = (ImageView) findViewById(R.id.imageView);

        //Home Button
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();
        imageView.setImageResource(i.getIntExtra("image", 0));

        //To zoom in image on tap or pinch
        PhotoViewAttacher photoAttacher;
        photoAttacher = new PhotoViewAttacher(imageView);
        photoAttacher.update();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(ImageDetailsActivity.this, MainActivity.class);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
