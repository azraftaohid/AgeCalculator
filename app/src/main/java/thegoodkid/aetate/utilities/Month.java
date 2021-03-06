package thegoodkid.aetate.utilities;

import android.util.Log;

import androidx.annotation.Nullable;

public enum Month {
    JANUARY("Jan", 31),
    FEBRUARY("Feb", 28),
    MARCH("Mar", 31),
    APRIL("Apr", 30),
    MAY("May", 31),
    JUNE("Jun", 30),
    JULY("Jul", 31),
    AUGUST("Aug", 31),
    SEPTEMBER("Sep", 30),
    OCTOBER("Oct", 31),
    NOVEMBER("Nov", 30),
    DECEMBER("Dec", 31);

    private final String LOG_TAG = getClass().getSimpleName();
    private String mShortName;
    private int mNumberOfDays;

    Month(String shortName, int numberOfDays) {
        mShortName = shortName;
        mNumberOfDays = numberOfDays;
    }

    @Nullable
    @SuppressWarnings("unused")
    public Month getMonthByShortName(String name) {
        for (Month month : Month.values()) {
            if (month.getShortName().equalsIgnoreCase(name))
                return month;
        }
        Log.i(LOG_TAG, "Month: " + name + ", does not exist");

        return null;
    }

    public int getNumberOfDays() {
        return mNumberOfDays;
    }

    public String getShortName() {
        return mShortName;
    }
}
