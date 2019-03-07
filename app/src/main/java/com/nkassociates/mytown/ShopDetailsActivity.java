package com.nkassociates.mytown;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import uk.co.senab.photoview.PhotoViewAttacher;

public class ShopDetailsActivity extends AppCompatActivity {

    //Declare inside class.
    ImageView imageView;
    TextView tvName, tvLocation, tvContact, tvAddress, tvWebsite;
    FloatingActionButton fabCall, fabShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_details);

        //Bind inside onCreate().
        imageView = (ImageView) findViewById(R.id.imageView);
        tvName = (TextView) findViewById(R.id.tvName);
        tvLocation = (TextView) findViewById(R.id.tvLocation);
        tvContact = (TextView) findViewById(R.id.tvContact);
        tvWebsite = (TextView) findViewById(R.id.tvWebsite);
        tvAddress = (TextView) findViewById(R.id.tvAddress);
        fabCall = (FloatingActionButton) findViewById(R.id.fabCall);
        fabShare = (FloatingActionButton) findViewById(R.id.fabShare);

        //Home Button
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();
        final String name = i.getStringExtra("name");
        final String location = i.getStringExtra("location");
        final String imageLink = i.getStringExtra("image");
        final String contact = i.getStringExtra("contact");
        final String website = i.getStringExtra("website");
        final String address = i.getStringExtra("address");

        Picasso.with(ShopDetailsActivity.this).load(imageLink).into(imageView);
        PhotoViewAttacher photoAttacher;
        photoAttacher = new PhotoViewAttacher(imageView);
        photoAttacher.update();
        tvName.setText(name);
        tvLocation.setText(location);
        tvContact.setText(contact);
        tvAddress.setText(address);
        tvWebsite.setText(website);

        fabCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + contact));
                startActivity(i);
            }
        });

        fabShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BitmapDrawable bitmapDrawable;
                Bitmap bitmap;
                bitmapDrawable = (BitmapDrawable) imageView.getDrawable();
                bitmap = bitmapDrawable.getBitmap();
                String imageBitmapPath = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Title", null);
                Uri imageBitmapUri = Uri.parse(imageBitmapPath);
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("*/*");
                i.putExtra(Intent.EXTRA_TEXT, "Name: " + name + "\n" + "Location: " + location + "\n" + "Contact: " + contact
                        + "\n" + "Address: " + address + "\n" + "Website: " + website + "\n");
                i.putExtra(Intent.EXTRA_STREAM, imageBitmapUri);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(ShopDetailsActivity.this, DescriptionActivity.class);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
