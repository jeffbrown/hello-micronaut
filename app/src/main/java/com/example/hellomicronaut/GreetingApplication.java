package com.example.hellomicronaut;

import android.app.Application;

import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.logging.JdkLoggerFactory;

public class GreetingApplication extends Application {

    private HelloMicronautLifecycleCallbacks callback;

    public GreetingApplication() {
        super();
        InternalLoggerFactory.setDefaultFactory(JdkLoggerFactory.INSTANCE);
    }

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
