package com.nkassociates.mytown;


/**
 * Created by vivek on 03-04-2018.
 */

public class ListItem2 {

    String name, location, imageURL, Button;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getButton() {
        return Button;
    }


    public ListItem2(String name, String location, String imageURL, String Button) {
        this.name = name;
        this.location = location;
        this.imageURL = imageURL;
        this.Button = Button;
    }
}
