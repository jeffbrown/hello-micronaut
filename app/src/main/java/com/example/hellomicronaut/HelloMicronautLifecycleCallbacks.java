package com.example.hellomicronaut;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import io.micronaut.context.ApplicationContext;
import io.micronaut.context.ApplicationContextBuilder;
import io.micronaut.context.env.Environment;

class HelloMicronautLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

    final ApplicationContext ctx;

    HelloMicronautLifecycleCallbacks() {
        ApplicationContextBuilder build = ApplicationContext.build(GreetingApplication.class, Environment.ANDROID);
        ctx = build.start();
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ctx.inject(activity);
    }

    @Override
    public void onActivityStarted(Activity activity) {
    }

    @Override
    public void onActivityResumed(Activity activity) {
    }

    @Override
    public void onActivityPaused(Activity activity) {
    }

    @Override
    public void onActivityStopped(Activity activity) {
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
    }

    public void onTerminate() {
        if (ctx != null && ctx.isRunning()) {
            ctx.stop();
        }
    }
}
