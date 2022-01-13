package com.richvtro.kijnghred.richking;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.onesignal.OneSignal;
import com.richvtro.kijnghred.richking.kdk.Dejdjs;
import com.richvtro.kijnghred.richking.kdk.Nds;


public class SA16 extends Activity {

    WebView webbb;

    public ValueCallback<Uri> ierep;
    public Uri kjsds = null;
    public ValueCallback<Uri[]> ksjdsdj;
    public String kdjdsjd;
    public static final int kdshhds = 1;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sa16);
        getWindow().addFlags(1024);

        webbb = findViewById(R.id.webViewF);

        int llll = Settings.Secure.getInt(this.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);

        if (llll == 0){
            Nds nds = new Nds(webbb,this);
            nds.nds();
        }else {
            MainActivity.sta(this);
        }

    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String parrrr(String campaignStr, String getPackageName, String AID, String appsFlyerUID){

        String lldkd;
        String sub6;
        String sub7;
        String sub2;
        String sub3;
        String sub4;
        String sub5;

        String[] kkdsh = campaignStr.split("::");
        try {
            lldkd = kkdsh[0];
        }catch (Exception e){
            lldkd = "";
        }
        try {
            sub6 = kkdsh[1];
        }catch (Exception e){
            sub6 = "";
        }

        try {
            sub7 = kkdsh[2];
        }catch (Exception e){
            sub7 = "";

        }

        try {
            sub2 = kkdsh[3];
        }catch (Exception e){
            sub2 = "";
        }

        try {
            sub3 = kkdsh[4];
        }catch (Exception e){
            sub3 = "";
        }


        try {
            sub4 = kkdsh[5];
        }catch (Exception e){
            sub4 = "";
        }

        try {
            sub5 = kkdsh[6];
        }catch (Exception e){
            sub5 = "";
        }

        OneSignal.sendTag(Dejdjs.de("c3ViX2FwcA=="),sub6);

        String khsdh = Dejdjs.de("P2J1bmRsZT0=") + getPackageName + Dejdjs.de("JmFkX2lkPQ==") + AID + Dejdjs.de("JmFwcHNfaWQ9") + appsFlyerUID +
                Dejdjs.de("JnN1YjY9") + sub6 +
                Dejdjs.de("JnN1Yjc9") + sub7 +
                Dejdjs.de("JnN1YjI9") + sub2 +
                Dejdjs.de("JnN1YjM9") + sub3 +
                Dejdjs.de("JnN1YjQ9") + sub4 +
                Dejdjs.de("JnN1YjU9") + sub5;

        return  lldkd + khsdh;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != kdshhds || ksjdsdj == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        jjsdj(resultCode, data);
        if (ierep == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        lkhs(resultCode, data);
    }

    private void jjsdj(int kdjs, Intent lkj) {
        Uri[] results = null;
        if (kdjs == Activity.RESULT_OK) {
            if (lkj == null) {
                if (kdjdsjd != null) {
                    results = new Uri[]{Uri.parse(kdjdsjd)};
                }
            } else {
                String ljds = lkj.getDataString();
                if (ljds != null) {
                    results = new Uri[]{Uri.parse(ljds)};
                }
            }
        }
        ksjdsdj.onReceiveValue(results);
        ksjdsdj = null;
    }

    private void lkhs(int trwq, Intent kdhhds) {
        Uri result = null;
        try {
            if (trwq != RESULT_OK) {
                result = null;
            } else {
                result = kdhhds == null ? kjsds : kdhhds.getData();
            }
        } catch (Exception e) { }
        ierep.onReceiveValue(result);
        ierep = null;
    }
    @Override
    public void onBackPressed() {
        if (webbb.isFocused() && webbb.canGoBack()) {
            webbb.goBack();
        }
    }


}
