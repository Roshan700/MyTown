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

public class SubCategoryActivity extends AppCompatActivity {

    //Declare inside class
    TextView tvSubCategory1, tvSubCategory2, tvSubCategory3, tvSubCategory4, tvSubCategory5, tvSubCategory6, tvSubCategory7, tvSubCategory8, tvSubCategory9, tvSubCategory10;
    CardView cvSubCategory1, cvSubCategory2, cvSubCategory3, cvSubCategory4, cvSubCategory5, cvSubCategory6, cvSubCategory7, cvSubCategory8, cvSubCategory9, cvSubCategory10;
    String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);

        //Bind inside onCreate().
        tvSubCategory1 = (TextView) findViewById(R.id.tvSubCategory1);
        tvSubCategory2 = (TextView) findViewById(R.id.tvSubCategory2);
        tvSubCategory3 = (TextView) findViewById(R.id.tvSubCategory3);
        tvSubCategory4 = (TextView) findViewById(R.id.tvSubCategory4);
        tvSubCategory5 = (TextView) findViewById(R.id.tvSubCategory5);
        tvSubCategory6 = (TextView) findViewById(R.id.tvSubCategory6);
        tvSubCategory7 = (TextView) findViewById(R.id.tvSubCategory7);
        tvSubCategory8 = (TextView) findViewById(R.id.tvSubCategory8);
        tvSubCategory9 = (TextView) findViewById(R.id.tvSubCategory9);
        tvSubCategory10 = (TextView) findViewById(R.id.tvSubCategory10);

        cvSubCategory1 = (CardView) findViewById(R.id.cvSubCategory1);
        cvSubCategory2 = (CardView) findViewById(R.id.cvSubCategory2);
        cvSubCategory3 = (CardView) findViewById(R.id.cvSubCategory3);
        cvSubCategory4 = (CardView) findViewById(R.id.cvSubCategory4);
        cvSubCategory5 = (CardView) findViewById(R.id.cvSubCategory5);
        cvSubCategory6 = (CardView) findViewById(R.id.cvSubCategory6);
        cvSubCategory7 = (CardView) findViewById(R.id.cvSubCategory7);
        cvSubCategory8 = (CardView) findViewById(R.id.cvSubCategory8);
        cvSubCategory9 = (CardView) findViewById(R.id.cvSubCategory9);
        cvSubCategory10 = (CardView) findViewById(R.id.cvSubCategory10);

        //Combined 3 Activities into 1 using location.
        Intent i = getIntent();
        location = i.getStringExtra("location");

        //Home Button
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        //Locked orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        if (location.equals("Ambernath")) {
            cvSubCategory1.setVisibility(View.VISIBLE);
            tvSubCategory1.setText("SubCategory 1");
            cvSubCategory2.setVisibility(View.VISIBLE);
            tvSubCategory2.setText("SubCategory 2");
            cvSubCategory3.setVisibility(View.VISIBLE);
            tvSubCategory3.setText("SubCategory 3");
            cvSubCategory4.setVisibility(View.VISIBLE);
            tvSubCategory4.setText("SubCategory 4");
            cvSubCategory5.setVisibility(View.VISIBLE);
            tvSubCategory5.setText("SubCategory 5");
            cvSubCategory6.setVisibility(View.VISIBLE);
            tvSubCategory6.setText("SubCategory 6");
            cvSubCategory7.setVisibility(View.VISIBLE);
            tvSubCategory7.setText("SubCategory 7");
            cvSubCategory8.setVisibility(View.VISIBLE);
            tvSubCategory8.setText("SubCategory 8");
            cvSubCategory9.setVisibility(View.VISIBLE);
            tvSubCategory9.setText("SubCategory 9");
            cvSubCategory10.setVisibility(View.VISIBLE);
            tvSubCategory10.setText("SubCategory 10");
        }

        if (location.equals("Ulhasnagar")) {
            cvSubCategory1.setVisibility(View.VISIBLE);
            tvSubCategory1.setText("SubCategory 1");
            cvSubCategory2.setVisibility(View.VISIBLE);
            tvSubCategory2.setText("SubCategory 2");
            cvSubCategory3.setVisibility(View.VISIBLE);
            tvSubCategory3.setText("SubCategory 3");
            cvSubCategory4.setVisibility(View.VISIBLE);
            tvSubCategory4.setText("SubCategory 4");
            cvSubCategory5.setVisibility(View.VISIBLE);
            tvSubCategory5.setText("SubCategory 5");
            cvSubCategory6.setVisibility(View.VISIBLE);
            tvSubCategory6.setText("SubCategory 6");
            cvSubCategory7.setVisibility(View.VISIBLE);
            tvSubCategory7.setText("SubCategory 7");
            cvSubCategory8.setVisibility(View.VISIBLE);
            tvSubCategory8.setText("SubCategory 8");
            cvSubCategory9.setVisibility(View.VISIBLE);
            tvSubCategory9.setText("SubCategory 9");
            cvSubCategory10.setVisibility(View.VISIBLE);
            tvSubCategory10.setText("SubCategory 10");
        }

        if (location.equals("Kalyan")) {
            cvSubCategory1.setVisibility(View.VISIBLE);
            tvSubCategory1.setText("SubCategory 1");
            cvSubCategory2.setVisibility(View.VISIBLE);
            tvSubCategory2.setText("SubCategory 2");
            cvSubCategory3.setVisibility(View.VISIBLE);
            tvSubCategory3.setText("SubCategory 3");
            cvSubCategory4.setVisibility(View.VISIBLE);
            tvSubCategory4.setText("SubCategory 4");
            cvSubCategory5.setVisibility(View.VISIBLE);
            tvSubCategory5.setText("SubCategory 5");
            cvSubCategory6.setVisibility(View.VISIBLE);
            tvSubCategory6.setText("SubCategory 6");
            cvSubCategory7.setVisibility(View.VISIBLE);
            tvSubCategory7.setText("SubCategory 7");
            cvSubCategory8.setVisibility(View.VISIBLE);
            tvSubCategory8.setText("SubCategory 8");
            cvSubCategory9.setVisibility(View.VISIBLE);
            tvSubCategory9.setText("SubCategory 9");
            cvSubCategory10.setVisibility(View.VISIBLE);
            tvSubCategory10.setText("SubCategory 10");
        }

        //Text of subcategory and object on Firebase should have same name.
        cvSubCategory1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubCategoryActivity.this, DescriptionActivity.class);
                i.putExtra("location", location);
                String subcategory = tvSubCategory1.getText().toString();
                i.putExtra("subcategory", subcategory);
                startActivity(i);
            }
        });
        cvSubCategory2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SubCategoryActivity.this, DescriptionActivity.class);
                i.putExtra("location", location);
                String subcategory = tvSubCategory2.getText().toString();
                i.putExtra("subcategory", subcategory);
                startActivity(i);
            }
        });
        cvSubCategory3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SubCategoryActivity.this, DescriptionActivity.class);
                i.putExtra("location", location);
                String subcategory = tvSubCategory3.getText().toString();
                i.putExtra("subcategory", subcategory);
                startActivity(i);
            }
        });
        cvSubCategory4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubCategoryActivity.this, DescriptionActivity.class);
                i.putExtra("location", location);
                String subcategory = tvSubCategory4.getText().toString();
                i.putExtra("subcategory", subcategory);
                startActivity(i);
            }
        });
        cvSubCategory5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubCategoryActivity.this, DescriptionActivity.class);
                i.putExtra("location", location);
                String subcategory = tvSubCategory5.getText().toString();
                i.putExtra("subcategory", subcategory);
                startActivity(i);
            }
        });
        cvSubCategory6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubCategoryActivity.this, DescriptionActivity.class);
                i.putExtra("location", location);
                String subcategory = tvSubCategory6.getText().toString();
                i.putExtra("subcategory", subcategory);
                startActivity(i);
            }
        });
        cvSubCategory7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubCategoryActivity.this, DescriptionActivity.class);
                i.putExtra("location", location);
                String subcategory = tvSubCategory7.getText().toString();
                i.putExtra("subcategory", subcategory);
                startActivity(i);
            }
        });
        cvSubCategory8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubCategoryActivity.this, DescriptionActivity.class);
                i.putExtra("location", location);
                String subcategory = tvSubCategory8.getText().toString();
                i.putExtra("subcategory", subcategory);
                startActivity(i);
            }
        });
        cvSubCategory9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubCategoryActivity.this, DescriptionActivity.class);
                i.putExtra("location", location);
                String subcategory = tvSubCategory9.getText().toString();
                i.putExtra("subcategory", subcategory);
                startActivity(i);
            }
        });
        cvSubCategory10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubCategoryActivity.this, DescriptionActivity.class);
                i.putExtra("location", location);
                String subcategory = tvSubCategory10.getText().toString();
                i.putExtra("subcategory", subcategory);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(SubCategoryActivity.this, CategoryActivity.class);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
