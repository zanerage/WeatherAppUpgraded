package com.mario_antolovic.weatherappupgraded.Common;

import android.location.Location;

import com.google.android.gms.location.LocationRequest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {


    public static final String APP_ID = "d9345b7b4244c9f6fe0f4d2418ee9856";
    public static Location current_location = null;

    public static String convertUnixToDate(int dt) {

        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm EEE MM yyyy");
        String formatted = sdf.format(date);
        return formatted;


    }
}
