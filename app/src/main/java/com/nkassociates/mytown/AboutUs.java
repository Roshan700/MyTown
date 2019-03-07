package com.nkassociates.mytown;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;

public class AboutUs extends AppCompatActivity {

    //Declare inside class
    WebView wvAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        //Bind inside onCreate().
        wvAboutUs = (WebView) findViewById(R.id.wvAboutUs);

        wvAboutUs.loadUrl("file:///android_asset/aboutus.html");

        //Locked orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //Home Button
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(AboutUs.this, MainActivity.class);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
