package com.freelancer.msl.extra;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Malek Shefat on 2/24/2018.
 * All rights preserved.
 */

public abstract class OrientedActivity extends AppCompatActivity {

    /*
    this custom activity forces the app to have specific orientation for some specific device.
     */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setOrientation();
    }

    private void setOrientation() {
        if (Helpers.isTablet(this))
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        else
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
}
