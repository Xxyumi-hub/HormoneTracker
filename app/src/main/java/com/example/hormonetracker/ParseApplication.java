package com.example.hormonetracker;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("yrH28kZgM1MpU4XjqSNd1U6dNtseTeBpgyqvX7tG")
                .clientKey("4rYBw3ZXV0nrlzVqlUNAMlc9tK6hgPSojGjESuKb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

