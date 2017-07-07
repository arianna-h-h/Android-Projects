package edu.austincc.AppAbilities;


import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

// for older than API 11 remove SettingsFragment class and all references to it
// in onCreate replace getFragmentManager statement with
// addPreferencesFromResource(R.xml.preferences);
// change Activity to PreferenceActivity

// see http://developer.android.com/guide/topics/ui/settings.html#Activity

public class PreferencesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		getFragmentManager().beginTransaction()
        	.replace(android.R.id.content, new SettingsFragment())
        	.commit();
	}

	public static class SettingsFragment extends PreferenceFragment {
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	        // Load the preferences from an XML resource
	        addPreferencesFromResource(R.xml.preferences);
	    }
	}

}
/* for older than API 11, replaces all code above
 * will need to update imports
  
public class PreferencesActivity extends PreferenceActivity {

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
	}
	
}

 */

