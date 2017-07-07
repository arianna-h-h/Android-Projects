package edu.austincc.AppAbilities;


import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;


public class CustomViewActivity extends Activity {
	SharedPreferences prefs;
	CustomView customView;
	int col1;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		customView = new CustomView(this);
		customView.requestFocus();
		setContentView(customView);

		prefs = PreferenceManager.getDefaultSharedPreferences(this);

		col1 = Color.parseColor(prefs.getString("key_color", ""));
		customView.mDrawable.getPaint().setColor(col1);



		//colString = prefs.getString("key_diff", "");





	}



}