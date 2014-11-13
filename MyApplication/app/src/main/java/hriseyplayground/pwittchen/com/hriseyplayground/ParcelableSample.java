package hriseyplayground.pwittchen.com.hriseyplayground;

import android.os.Parcelable;

public class ParcelableSample implements Parcelable {

    public static final android.os.Parcelable.Creator<ParcelableSample> CREATOR = new CreatorImpl();

    String myString;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeString(this.myString);
    }

    protected ParcelableSample(android.os.Parcel source) {
        this.myString = source.readString();
    }

    private static class CreatorImpl implements android.os.Parcelable.Creator<ParcelableSample> {

        public ParcelableSample createFromParcel(android.os.Parcel source) {
            return new ParcelableSample(source);
        }

        public ParcelableSample[] newArray(int size) {
            return new ParcelableSample[size];
        }
    }

}
