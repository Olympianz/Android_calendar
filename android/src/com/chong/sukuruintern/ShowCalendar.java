package com.chong.sukuruintern;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TabHost;


public class ShowCalendar extends Activity {
	//FlyOutContainer root;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.root = (FlyOutContainer) this.getLayoutInflater().inflate(R.layout.acitivity_sample, null);
        setContentView(R.layout.showcalendar);
        //setContentView(root);
        
        TabHost tabs=(TabHost)findViewById(R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("tag1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Daily");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("tag2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Agenda");
        tabs.addTab(spec);
    }
    /*
    public boolean onCreateOptionMenu (Menu menu) {
    	// Inflate the menu; this adds items to the action bar if it is the present
    	getMenuInflater().inflate(R.menu.sample, menu);
    	return true;
    }
    
    public  void toggleMenu(View v) {
    	this.root.toggleMenu();
    }
    */
}

     