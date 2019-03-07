package com.nkassociates.mytown;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by vivek on 01-04-2018.
 */

public class ViewPagerAdapter2 extends PagerAdapter {

    private Context context;
    private String location;
    private LayoutInflater layoutInflater;
    //This array holds the references for images of slider. Add reference of all images to corresponding place array.
    private Integer[] imagesA = {R.drawable.slide1, R.drawable.slide2};
    private Integer[] imagesU = {R.drawable.slide3, R.drawable.slide4, R.drawable.slide5, R.drawable.slide6};
    private Integer[] imagesK = {R.drawable.slide7, R.drawable.slide8, R.drawable.slide9};

    public ViewPagerAdapter2(Context context, String location) {
        this.context = context;
        this.location = location;
    }

    @Override
    public int getCount() {
        if (location.equals("Ambernath"))
            return imagesA.length;
        if (location.equals("Ulhasnagar"))
            return imagesU.length;
        if (location.equals("Kalyan"))
            return imagesK.length;
        return imagesA.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout2, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView2);
        if (location.equals("Ambernath")) {
            imageView.setImageResource(imagesA[position]);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(context, ImageDetailsActivity.class);
                    i.putExtra("image", imagesA[position]);
                    context.startActivity(i);
                }
            });
        }
        if (location.equals("Ulhasnagar")) {
            imageView.setImageResource(imagesU[position]);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(context, ImageDetailsActivity.class);
                    i.putExtra("image", imagesU[position]);
                    context.startActivity(i);
                }
            });
        }
        if (location.equals("Kalyan")) {
            imageView.setImageResource(imagesK[position]);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(context, ImageDetailsActivity.class);
                    i.putExtra("image", imagesK[position]);
                    context.startActivity(i);
                }
            });
        }
        //This adds our View created to the ViewPager(This gives the View for image slider).
        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView(view);
    }
}
