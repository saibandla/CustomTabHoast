package com.test.customtabhost;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabslayout);
		TextView txt=(TextView)findViewById(R.id.tabtext);
		txt.setText("Profile");
	}
}
