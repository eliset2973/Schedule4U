package com.example.schedule4u;

import android.app.Application;
import android.content.Context;

// this is used to save data
public class S4UApplication extends Application {
    private static Context context;
    public static Context getContext() {
        return S4UApplication.context;
    }
    public void onCreate() {
        super.onCreate();
        S4UApplication.context = getApplicationContext();
    }

}
