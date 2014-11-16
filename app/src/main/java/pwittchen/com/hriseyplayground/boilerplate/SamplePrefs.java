package pwittchen.com.hriseyplayground.boilerplate;

import android.content.SharedPreferences;

public final class SamplePrefs {
    private static final String MY_FLOAT = "myFloat";
    private static final String MY_INT = "myInt";

    private final SharedPreferences prefs;

    public SamplePrefs(SharedPreferences prefs) {
        this.prefs = prefs;
    }

    public float getMyFloat() {
        return this.prefs.getFloat(MY_FLOAT, 0.0f);
    }

    public void setMyFloat(float myFloat) {
        this.prefs.edit().putFloat(MY_FLOAT, myFloat).apply();
    }

    public boolean containsMyFloat() {
        return this.prefs.contains(MY_FLOAT);
    }

    public void removeMyFloat() {
        this.prefs.edit().remove(MY_FLOAT).apply();
    }

    public int getMyInt() {
        return this.prefs.getInt(MY_INT, 1000);
    }

    public void setMyInt(int myInt) {
        this.prefs.edit().putInt(MY_INT, myInt).apply();
    }

    public boolean containsMyInt() {
        return this.prefs.contains(MY_INT);
    }

    public void removeMyInt() {
        this.prefs.edit().remove(MY_INT).apply();
    }
}
