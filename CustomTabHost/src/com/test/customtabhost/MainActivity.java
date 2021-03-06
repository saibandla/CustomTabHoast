package com.test.customtabhost;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;


public class MainActivity extends TabActivity {
	  TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addTab("Rewards", R.drawable.tab_rewards, RewardsActivity.class);
        addTab("Profile", R.drawable.tab_profile, ProfileActivity.class);
        addTab("Favourites", R.drawable.tab_fav, Favourites.class);
        addTab("More", R.drawable.tab_more, More.class);

    }
    private void addTab(String labelId, int drawable, Class<?> c) {

    	tabHost = getTabHost();
    	Intent intent = new Intent(this, c);
    	TabSpec spec = tabHost.newTabSpec("tab" + labelId);

    	View tabIndicator = LayoutInflater.from(this).inflate(R.layout.tab_indicator, getTabWidget(), false);
    	TextView title = (TextView) tabIndicator.findViewById(R.id.title);
    	title.setText(labelId);

    	ImageView icon = (ImageView) tabIndicator.findViewById(R.id.icon);
    	icon.setImageResource(drawable);
    	icon.setScaleType(ImageView.ScaleType.FIT_CENTER);

    	spec.setIndicator(tabIndicator);
    	spec.setContent(intent);
    	tabHost.addTab(spec);
    	}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        
        return super.onOptionsItemSelected(item);
    }
}
