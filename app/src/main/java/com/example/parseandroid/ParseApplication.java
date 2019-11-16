package com.example.parseandroid;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("parsegram1")
                // if desired
                .clientKey("MMA5gx0")
                .server("https://parsegram1.herokuapp.com/parse/")
                .build()
        );
    }
}
