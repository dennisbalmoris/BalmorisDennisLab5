package com.balmoris.dennis;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyService extends IntentService {
    public MyService()
    {
        super("MyService");
    }

    protected void onHandleIntent(@Nullable Intent intent){
        Log.d("Dennis", "Service is running...");
    }
}
