package com.chong.sukuruintern;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateCalendar extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.createcalendar);
		
		Button btn = (Button) findViewById(R.id.cc_btn01);
		btn.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent("fordham.chong.importCalendar");
				startActivity(myIntent);	
			}
		});
	}
}
