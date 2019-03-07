package com.nkassociates.mytown;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by vivek on 03-04-2018.
 */

public class ListItem {

    String name, location, imageURL, contact, website, address;


    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getContact() {
        return contact;
    }

    public String getWebsite() {
        return website;
    }

    public String getAddress() {
        return address;
    }

    public ListItem(String name, String location, String imageURL, String contact, String website, String address) {
        this.name = name;
        this.location = location;
        this.imageURL = imageURL;
        this.contact = contact;
        this.website = website;
        this.address = address;

    }
}


