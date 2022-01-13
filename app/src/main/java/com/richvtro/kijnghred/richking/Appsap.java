package com.richvtro.kijnghred.richking;

import android.app.Application;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;
import com.richvtro.kijnghred.richking.kdk.Dejdjs;

import java.util.Map;

public class Appsap extends Application {

    public static String fd;
    public static String ljj = "";
    public static String ldsj;
    public static String qwqw;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();
        ov();
        iew();
        udd();

        AppsFlyerLib.getInstance().init(Dejdjs.de(MainActivity.oreo), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {

                ljj = map.get(Dejdjs.de("YWZfc3RhdHVz")).toString();
                if (ljj.equals(Dejdjs.de("Tm9uLW9yZ2FuaWM="))){
                    String str =map.get(Dejdjs.de("Y2FtcGFpZ24=")).toString();
                    qwqw = SA16.parrrr(str,getPackageName(), ldsj, fd);
                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },this);
        AppsFlyerLib.getInstance().start(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void ov(){
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(Dejdjs.de(MainActivity.oooo));
    }

    private void iew(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ldsj = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                }catch (Exception e){

                }
            }
        }).start();
    }

    private void udd(){
        fd = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
    }
}
