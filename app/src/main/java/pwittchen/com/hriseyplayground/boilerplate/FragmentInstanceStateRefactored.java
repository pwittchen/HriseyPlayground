package pwittchen.com.hriseyplayground.boilerplate;

import android.app.Fragment;

import java.util.ArrayList;

import hrisey.InstanceState;

public class FragmentInstanceStateRefactored extends Fragment {
    @InstanceState
    private int myInt;
    @InstanceState
    private ParcelableSample myParcelable;
    @InstanceState
    private ArrayList<String> myStrings;
}
