package com.nkassociates.mytown;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class DetailsActivity extends AppCompatActivity {

    //Declare inside class
    CardView cvStores, cvAboutTown;
    TextView tvStores, tvAboutTown;
    ViewPager viewPager;
    String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Bind inside onCreate()
        cvStores = (CardView) findViewById(R.id.cvStores);
        cvAboutTown = (CardView) findViewById(R.id.cvAboutTown);
        tvStores = (TextView) findViewById(R.id.tvStores);
        tvAboutTown = (TextView) findViewById(R.id.tvAboutTown);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        //Lock orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //Home Button
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        //Combined 3 Activities into 1 using location.
        Intent i = getIntent();
        location = i.getStringExtra("location");

        tvStores.setText("Stores in " + location);
        tvAboutTown.setText("About " + location);

        cvStores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetailsActivity.this, CategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });

        cvAboutTown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetailsActivity.this, TownInfo.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });

        ViewPagerAdapter2 viewPagerAdapter = new ViewPagerAdapter2(this, location);
        viewPager.setAdapter(viewPagerAdapter);

        Timer timer = new Timer();
        //This allows the image to automatically slide after every 4 seconds.
        timer.scheduleAtFixedRate(new DetailsActivity.MyTimerTask(), 2000, 4000);
    }

    public class MyTimerTask extends TimerTask {
        @Override
        public void run() {
            DetailsActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (location.equals("Ambernath")) {
                        //Add conditions wrt to number of images in Ambernath.
                        if (viewPager.getCurrentItem() == 0) {
                            viewPager.setCurrentItem(1);
                        } else if (viewPager.getCurrentItem() == 1) {
                            viewPager.setCurrentItem(0);
                        }
                    }
                    if (location.equals("Ulhasnagar")) {
                        //Add conditions wrt to number of images in Ulhasnagar.
                        if (viewPager.getCurrentItem() == 0) {
                            viewPager.setCurrentItem(1);
                        } else if (viewPager.getCurrentItem() == 1) {
                            viewPager.setCurrentItem(2);
                        } else if (viewPager.getCurrentItem() == 2) {
                            viewPager.setCurrentItem(3);
                        } else if (viewPager.getCurrentItem() == 3) {
                            viewPager.setCurrentItem(0);
                        }
                    }
                    if (location.equals("Kalyan")) {
                        //Add conditions wrt to number of images in Kalyan.
                        if (viewPager.getCurrentItem() == 0) {
                            viewPager.setCurrentItem(1);
                        } else if (viewPager.getCurrentItem() == 1) {
                            viewPager.setCurrentItem(2);
                        } else if (viewPager.getCurrentItem() == 2) {
                            viewPager.setCurrentItem(0);
                        }
                    }
                }
            });
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(DetailsActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(DetailsActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
