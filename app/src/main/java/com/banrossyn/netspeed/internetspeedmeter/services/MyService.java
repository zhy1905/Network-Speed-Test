package com.banrossyn.netspeed.internetspeedmeter.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


import androidx.annotation.Nullable;


public class MyService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // do your jobs here
        return super.onStartCommand(intent, flags, startId);
    }
}