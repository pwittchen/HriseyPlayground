package pwittchen.com.hriseyplayground;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import hrisey.InstanceState;
import pwittchen.com.hriseyplayground.boilerplate.SamplePrefsRefactored;


public class MainActivity extends Activity {

    @InstanceState
    private String sampleData;
    private SamplePrefsRefactored prefs;

    private EditText etInstanceState;
    private EditText etPrefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etInstanceState = (EditText) findViewById(R.id.et_sample_instance_state);
        etPrefs = (EditText) findViewById(R.id.et_sample_prefs);
        sampleData = "";
        prefs = new SamplePrefsRefactored(getSharedPreferences("samplePrefsRefactored", MODE_PRIVATE));
    }

    @Override
    protected void onResume() {
        super.onResume();
        etInstanceState.setText(sampleData);
        etPrefs.setText(prefs.getMyString());
    }

    @Override
    protected void onPause() {
        super.onPause();
        sampleData = etInstanceState.getText().toString();
        prefs.setMyString(etPrefs.getText().toString());
    }
}
