package com.richvtro.kijnghred.richking.kdk;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Base64;

public class Dejdjs {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String de(String re){

        Base64.Decoder jdds = Base64.getDecoder();
        return new String(jdds.decode(re));
    }
}
