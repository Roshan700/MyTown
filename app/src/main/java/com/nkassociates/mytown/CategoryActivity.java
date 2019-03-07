package com.nkassociates.mytown;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class CategoryActivity extends AppCompatActivity {

    //Declare inside class
    TextView tvCategory1, tvCategory2, tvCategory3, tvCategory4, tvCategory5, tvCategory6, tvCategory7, tvCategory8, tvCategory9, tvCategory10, tvCategory11, tvCategory12, tvCategory13, tvCategory14, tvCategory15, tvCategory16, tvCategory17, tvCategory18, tvCategory19, tvCategory20, tvCategory21, tvCategory22, tvCategory23, tvCategory24, tvCategory25;
    CardView cvCategory1, cvCategory2, cvCategory3, cvCategory4, cvCategory5, cvCategory6, cvCategory7, cvCategory8, cvCategory9, cvCategory10, cvCategory11, cvCategory12, cvCategory13, cvCategory14, cvCategory15, cvCategory16, cvCategory17, cvCategory18, cvCategory19, cvCategory20, cvCategory21, cvCategory22, cvCategory23, cvCategory24, cvCategory25;
    String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        //Bind inside onCreate().
        tvCategory1 = (TextView) findViewById(R.id.tvCategory1);
        tvCategory2 = (TextView) findViewById(R.id.tvCategory2);
        tvCategory3 = (TextView) findViewById(R.id.tvCategory3);
        tvCategory4 = (TextView) findViewById(R.id.tvCategory4);
        tvCategory5 = (TextView) findViewById(R.id.tvCategory5);
        tvCategory6 = (TextView) findViewById(R.id.tvCategory6);
        tvCategory7 = (TextView) findViewById(R.id.tvCategory7);
        tvCategory8 = (TextView) findViewById(R.id.tvCategory8);
        tvCategory9 = (TextView) findViewById(R.id.tvCategory9);
        tvCategory10 = (TextView) findViewById(R.id.tvCategory10);
        tvCategory11 = (TextView) findViewById(R.id.tvCategory11);
        tvCategory12 = (TextView) findViewById(R.id.tvCategory12);
        tvCategory13 = (TextView) findViewById(R.id.tvCategory13);
        tvCategory14 = (TextView) findViewById(R.id.tvCategory14);
        tvCategory15 = (TextView) findViewById(R.id.tvCategory15);
        tvCategory16 = (TextView) findViewById(R.id.tvCategory16);
        tvCategory17 = (TextView) findViewById(R.id.tvCategory17);
        tvCategory18 = (TextView) findViewById(R.id.tvCategory18);
        tvCategory19 = (TextView) findViewById(R.id.tvCategory19);
        tvCategory20 = (TextView) findViewById(R.id.tvCategory20);
        tvCategory21 = (TextView) findViewById(R.id.tvCategory21);
        tvCategory22 = (TextView) findViewById(R.id.tvCategory22);
        tvCategory23 = (TextView) findViewById(R.id.tvCategory23);
        tvCategory24 = (TextView) findViewById(R.id.tvCategory24);
        tvCategory25 = (TextView) findViewById(R.id.tvCategory25);

        cvCategory1 = (CardView) findViewById(R.id.cvCategory1);
        cvCategory2 = (CardView) findViewById(R.id.cvCategory2);
        cvCategory3 = (CardView) findViewById(R.id.cvCategory3);
        cvCategory4 = (CardView) findViewById(R.id.cvCategory4);
        cvCategory5 = (CardView) findViewById(R.id.cvCategory5);
        cvCategory6 = (CardView) findViewById(R.id.cvCategory6);
        cvCategory7 = (CardView) findViewById(R.id.cvCategory7);
        cvCategory8 = (CardView) findViewById(R.id.cvCategory8);
        cvCategory9 = (CardView) findViewById(R.id.cvCategory9);
        cvCategory10 = (CardView) findViewById(R.id.cvCategory10);
        cvCategory11 = (CardView) findViewById(R.id.cvCategory11);
        cvCategory12 = (CardView) findViewById(R.id.cvCategory12);
        cvCategory13 = (CardView) findViewById(R.id.cvCategory13);
        cvCategory14 = (CardView) findViewById(R.id.cvCategory14);
        cvCategory15 = (CardView) findViewById(R.id.cvCategory15);
        cvCategory16 = (CardView) findViewById(R.id.cvCategory16);
        cvCategory17 = (CardView) findViewById(R.id.cvCategory17);
        cvCategory18 = (CardView) findViewById(R.id.cvCategory18);
        cvCategory19 = (CardView) findViewById(R.id.cvCategory19);
        cvCategory20 = (CardView) findViewById(R.id.cvCategory20);
        cvCategory21 = (CardView) findViewById(R.id.cvCategory21);
        cvCategory22 = (CardView) findViewById(R.id.cvCategory22);
        cvCategory23 = (CardView) findViewById(R.id.cvCategory23);
        cvCategory24 = (CardView) findViewById(R.id.cvCategory24);
        cvCategory25 = (CardView) findViewById(R.id.cvCategory25);

        //Combined 3 Activities into 1 using location.
        Intent i = getIntent();
        location = i.getStringExtra("location");

        //Home Button
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        //Lock orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        if (location.equals("Ambernath")) {
            cvCategory1.setVisibility(View.VISIBLE);
            tvCategory1.setText("Category 1");
            cvCategory2.setVisibility(View.VISIBLE);
            tvCategory2.setText("Category 2");
            cvCategory3.setVisibility(View.VISIBLE);
            tvCategory3.setText("Category 3");
            cvCategory4.setVisibility(View.VISIBLE);
            tvCategory4.setText("Category 4");
            cvCategory5.setVisibility(View.VISIBLE);
            tvCategory5.setText("Category 5");
            cvCategory6.setVisibility(View.VISIBLE);
            tvCategory6.setText("Category 6");
            cvCategory7.setVisibility(View.VISIBLE);
            tvCategory7.setText("Category 7");
            cvCategory8.setVisibility(View.VISIBLE);
            tvCategory8.setText("Category 8");
            cvCategory9.setVisibility(View.VISIBLE);
            tvCategory9.setText("Category 9");
            cvCategory10.setVisibility(View.VISIBLE);
            tvCategory10.setText("Category 10");
            cvCategory11.setVisibility(View.VISIBLE);
            tvCategory11.setText("Category 11");
            cvCategory12.setVisibility(View.VISIBLE);
            tvCategory12.setText("Category 12");
            cvCategory13.setVisibility(View.VISIBLE);
            tvCategory13.setText("Category 13");
            cvCategory14.setVisibility(View.VISIBLE);
            tvCategory14.setText("Category 14");
            cvCategory15.setVisibility(View.VISIBLE);
            tvCategory15.setText("Category 15");
            cvCategory16.setVisibility(View.VISIBLE);
            tvCategory16.setText("Category 16");
            cvCategory17.setVisibility(View.VISIBLE);
            tvCategory17.setText("Category 17");
            cvCategory18.setVisibility(View.VISIBLE);
            tvCategory18.setText("Category 18");
            cvCategory19.setVisibility(View.VISIBLE);
            tvCategory19.setText("Category 19");
            cvCategory20.setVisibility(View.VISIBLE);
            tvCategory20.setText("Category 20");
            cvCategory21.setVisibility(View.VISIBLE);
            tvCategory21.setText("Category 21");
            cvCategory22.setVisibility(View.VISIBLE);
            tvCategory22.setText("Category 22");
            cvCategory23.setVisibility(View.VISIBLE);
            tvCategory23.setText("Category 23");
            cvCategory24.setVisibility(View.VISIBLE);
            tvCategory24.setText("Category 24");
            cvCategory25.setVisibility(View.VISIBLE);
            tvCategory25.setText("Category 25");
        }

        if (location.equals("Ulhasnagar")) {
            cvCategory1.setVisibility(View.VISIBLE);
            tvCategory1.setText("Category 1");
            cvCategory2.setVisibility(View.VISIBLE);
            tvCategory2.setText("Category 2");
            cvCategory3.setVisibility(View.VISIBLE);
            tvCategory3.setText("Category 3");
            cvCategory4.setVisibility(View.VISIBLE);
            tvCategory4.setText("Category 4");
            cvCategory5.setVisibility(View.VISIBLE);
            tvCategory5.setText("Category 5");
            cvCategory6.setVisibility(View.VISIBLE);
            tvCategory6.setText("Category 6");
            cvCategory7.setVisibility(View.VISIBLE);
            tvCategory7.setText("Category 7");
            cvCategory8.setVisibility(View.VISIBLE);
            tvCategory8.setText("Category 8");
            cvCategory9.setVisibility(View.VISIBLE);
            tvCategory9.setText("Category 9");
            cvCategory10.setVisibility(View.VISIBLE);
            tvCategory10.setText("Category 10");
            cvCategory11.setVisibility(View.VISIBLE);
            tvCategory11.setText("Category 11");
            cvCategory12.setVisibility(View.VISIBLE);
            tvCategory12.setText("Category 12");
            cvCategory13.setVisibility(View.VISIBLE);
            tvCategory13.setText("Category 13");
            cvCategory14.setVisibility(View.VISIBLE);
            tvCategory14.setText("Category 14");
            cvCategory15.setVisibility(View.VISIBLE);
            tvCategory15.setText("Category 15");
            cvCategory16.setVisibility(View.VISIBLE);
            tvCategory16.setText("Category 16");
            cvCategory17.setVisibility(View.VISIBLE);
            tvCategory17.setText("Category 17");
            cvCategory18.setVisibility(View.VISIBLE);
            tvCategory18.setText("Category 18");
            cvCategory19.setVisibility(View.VISIBLE);
            tvCategory19.setText("Category 19");
            cvCategory20.setVisibility(View.VISIBLE);
            tvCategory20.setText("Category 20");
            cvCategory21.setVisibility(View.VISIBLE);
            tvCategory21.setText("Category 21");
            cvCategory22.setVisibility(View.VISIBLE);
            tvCategory22.setText("Category 22");
            cvCategory23.setVisibility(View.VISIBLE);
            tvCategory23.setText("Category 23");
            cvCategory24.setVisibility(View.VISIBLE);
            tvCategory24.setText("Category 24");
            cvCategory25.setVisibility(View.VISIBLE);
            tvCategory25.setText("Category 25");
        }

        if (location.equals("Kalyan")) {
            cvCategory1.setVisibility(View.VISIBLE);
            tvCategory1.setText("Category 1");
            cvCategory2.setVisibility(View.VISIBLE);
            tvCategory2.setText("Category 2");
            cvCategory3.setVisibility(View.VISIBLE);
            tvCategory3.setText("Category 3");
            cvCategory4.setVisibility(View.VISIBLE);
            tvCategory4.setText("Category 4");
            cvCategory5.setVisibility(View.VISIBLE);
            tvCategory5.setText("Category 5");
            cvCategory6.setVisibility(View.VISIBLE);
            tvCategory6.setText("Category 6");
            cvCategory7.setVisibility(View.VISIBLE);
            tvCategory7.setText("Category 7");
            cvCategory8.setVisibility(View.VISIBLE);
            tvCategory8.setText("Category 8");
            cvCategory9.setVisibility(View.VISIBLE);
            tvCategory9.setText("Category 9");
            cvCategory10.setVisibility(View.VISIBLE);
            tvCategory10.setText("Category 10");
            cvCategory11.setVisibility(View.VISIBLE);
            tvCategory11.setText("Category 11");
            cvCategory12.setVisibility(View.VISIBLE);
            tvCategory12.setText("Category 12");
            cvCategory13.setVisibility(View.VISIBLE);
            tvCategory13.setText("Category 13");
            cvCategory14.setVisibility(View.VISIBLE);
            tvCategory14.setText("Category 14");
            cvCategory15.setVisibility(View.VISIBLE);
            tvCategory15.setText("Category 15");
            cvCategory16.setVisibility(View.VISIBLE);
            tvCategory16.setText("Category 16");
            cvCategory17.setVisibility(View.VISIBLE);
            tvCategory17.setText("Category 17");
            cvCategory18.setVisibility(View.VISIBLE);
            tvCategory18.setText("Category 18");
            cvCategory19.setVisibility(View.VISIBLE);
            tvCategory19.setText("Category 19");
            cvCategory20.setVisibility(View.VISIBLE);
            tvCategory20.setText("Category 20");
            cvCategory21.setVisibility(View.VISIBLE);
            tvCategory21.setText("Category 21");
            cvCategory22.setVisibility(View.VISIBLE);
            tvCategory22.setText("Category 22");
            cvCategory23.setVisibility(View.VISIBLE);
            tvCategory23.setText("Category 23");
            cvCategory24.setVisibility(View.VISIBLE);
            tvCategory24.setText("Category 24");
            cvCategory25.setVisibility(View.VISIBLE);
            tvCategory25.setText("Category 25");
        }

        cvCategory1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
        cvCategory25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryActivity.this, SubCategoryActivity.class);
                i.putExtra("location", location);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(CategoryActivity.this, DetailsActivity.class);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
