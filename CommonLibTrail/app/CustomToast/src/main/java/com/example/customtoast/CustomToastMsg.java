package com.example.customtoast;

import android.content.Context;
import android.widget.Toast;

public class CustomToastMsg {

    public static void SmallToastMsg(Context c, String message) {
        try {
            Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
        } catch (Exception w) {
            w.printStackTrace();
        }
    }

    public static void LongToastMsg(Context c, String message) {
        try {
            Toast.makeText(c, message, Toast.LENGTH_LONG).show();
        } catch (Exception w) {
            w.printStackTrace();
        }
    }

    public static void DefaultToastMsg(Context c, String message) {
        try {
            Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
        } catch (Exception w) {
            w.printStackTrace();
        }
    }

}
