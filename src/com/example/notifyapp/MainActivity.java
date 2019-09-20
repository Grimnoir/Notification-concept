package com.example.notifyapp;

import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
Button jbtnnotific;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jbtnnotific=(Button)findViewById(R.id.btnnotific);
        jbtnnotific.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent i=new Intent(MainActivity.this,MyNotific.class);
				PendingIntent pi=(PendingIntent.getActivity(getApplicationContext(), (int)System.currentTimeMillis(), i,0));
				Notification nf=new Notification.Builder(getApplicationContext())
				.setContentTitle("new mesage")
				.setContentText("Welcome User")
				.setSmallIcon(R.drawable.ic_launcher)
				.setAutoCancel(true)
				.setContentIntent(pi)
				.build();
				NotificationManager mgr=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
						mgr.notify(0,nf);
			}
		});
    }


}
