package hriseyplayground.pwittchen.com.hriseyplayground.boilerplate;

import android.app.Fragment;
import android.os.Bundle;

import java.util.ArrayList;

public class FragmentInstanceState extends Fragment {
    private static final String MY_INT = "myInt";
    private static final String MY_PARCELABLE = "myParcelable";
    private static final String MY_STRINGS = "myStrings";

    private int myInt;
    private ParcelableSample myParcelable;
    private ArrayList<String> myStrings;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            this.myInt = savedInstanceState.getInt(MY_INT);
            this.myParcelable = savedInstanceState.getParcelable(MY_PARCELABLE);
            this.myStrings = savedInstanceState.getStringArrayList(MY_STRINGS);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(MY_INT, this.myInt);
        outState.putParcelable(MY_PARCELABLE, this.myParcelable);
        outState.putStringArrayList(MY_STRINGS, this.myStrings);
    }
}
