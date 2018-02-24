package com.freelancer.msl.extra;

import android.content.Context;
import android.content.res.Configuration;

/**
 * Created by Malek Shefat on 2/24/2018.
 * All rights preserved.
 */

class Helpers {

    /*
    * Determine how big the phone is, returns true if TABLET, false otherwise.
    */
    static boolean isTablet(Context context) {
        return (context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK)
                >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }

}
