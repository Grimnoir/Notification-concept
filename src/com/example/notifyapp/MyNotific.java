package com.example.notifyapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MyNotific extends Activity {
TextView jtvwelcome;

@Override
protected void onCreate(Bundle savedInstanceState) {
	
	super.onCreate(savedInstanceState);
	setContentView(R.layout.notific);
	jtvwelcome=(TextView)findViewById(R.id.textView1);
}


}
