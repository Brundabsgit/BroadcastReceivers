package com.example.broadcostreceiver;

import static android.content.ContentValues.TAG;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
      String actionString = intent.getAction();
        Toast.makeText(context,actionString, Toast.LENGTH_LONG).show();
        //String timeZone = intent.getStringExtra("timeZone");
        //Log.d(TAG,"onReceive: " + timeZone);

        boolean isOn = intent.getBooleanExtra("state", false);
        Log.d(TAG,"onReceive: Airplane mode is on " + isOn);
    }
}