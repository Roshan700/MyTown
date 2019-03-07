package com.nkassociates.mytown;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by vivek on 02-04-2018.
 */

public class FireApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
