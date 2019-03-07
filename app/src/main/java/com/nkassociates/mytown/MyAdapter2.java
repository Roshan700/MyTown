package com.nkassociates.mytown;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by vivek on 03-04-2018.
 */

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.ViewHolder> {

    private List<ListItem2> listItems;
    private Context context;

    public MyAdapter2(List<ListItem2> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item2, parent, false);
        return new ViewHolder(v, context);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final ListItem2 listItem = listItems.get(position);
        holder.textViewName.setText(listItem.getName());
        holder.textViewLocation.setText(listItem.getLocation());
        Picasso.with(context).load(listItem.getImageURL()).into(holder.imageView);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, PlaceDetailsActivity.class);
                i.putExtra("name", listItem.getName());
                i.putExtra("location", listItem.getLocation());
                i.putExtra("image", listItem.getImageURL());
                i.putExtra("button",listItem.getButton());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewName;
        public TextView textViewLocation;
        public ImageView imageView;
        public Button btnBookMark;
        public LinearLayout linearLayout;
        private Context context;
        int flag =1;
        final MyDatabaseHelper dbh;


        public ViewHolder(View itemView, Context context) {
            super(itemView);

            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewLocation = (TextView) itemView.findViewById(R.id.textViewLocation);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            btnBookMark = (Button) itemView.findViewById(R.id.btnBookMark);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
            dbh = new MyDatabaseHelper(this);

            btnBookMark.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (flag == 1) {
                        Toast.makeText(ViewHolder.this.context.getApplicationContext(), "Bookmark set", Toast.LENGTH_SHORT).show();
                        dbh.addBookmark(title, location);
                        flag = 0;
                    } else {
                        Toast.makeText(ViewHolder.this.context.getApplicationContext(), "Bookmark delete", Toast.LENGTH_SHORT).show();
                        dbh.delBookmark(title);
                        flag = 1;
                    }
                }
            });
        }
    }
}
