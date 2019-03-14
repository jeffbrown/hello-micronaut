package com.example.hellomicronaut;

import android.support.multidex.MultiDexApplication;

public class GreetingApplication extends MultiDexApplication {

    private HelloMicronautLifecycleCallbacks callback;

    @Override
    public void onCreate() {
        super.onCreate();
        callback = new HelloMicronautLifecycleCallbacks();
        registerActivityLifecycleCallbacks(callback);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        callback.onTerminate();
    }
}
