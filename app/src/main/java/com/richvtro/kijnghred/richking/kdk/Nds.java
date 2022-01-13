package com.richvtro.kijnghred.richking.kdk;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.richvtro.kijnghred.richking.Appsap;
import com.richvtro.kijnghred.richking.MainActivity;
import com.richvtro.kijnghred.richking.SA16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Nds {

    WebView webView;
    SA16 sa16;
    String ewd;
    String [] dd;
    public static String kqqw;
    public static String jfdf;

    public Nds(WebView webView, SA16 sa16) {
        this.webView = webView;
        this.sa16 = sa16;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void nds (){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    dyei();
                    dd = ewd.split("\\\u007C");

                    sa16.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            fdfd();

                            String kssd = sa16.getSharedPreferences(sa16.getPackageName(), Context.MODE_PRIVATE).getString(Dejdjs.de("c2F2ZWRVcmw="), "uuuu");
                            Log.d("weq",kssd);
                            if (kssd.equals("uuuu")){
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Webbbe webbbe = new Webbbe(webView,sa16);
                                        webbbe.wws();
                                        webbbe.soro(dd[0],dd[1]);
                                    }
                                },5000);

                            }else {
                                Webbbe webbbe = new Webbbe(webView,sa16);
                                webbbe.wws();
                                webView.loadUrl(kssd);
                            }


                        }
                    });

                }catch (Exception e){
                    MainActivity.sta(sa16);
                }
            }
        }).start();

    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    private void dyei() throws Exception{
        HttpURLConnection ksd = (HttpURLConnection) new URL(Dejdjs.de(MainActivity.gigg)).openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ksd.getInputStream()));
        ewd = bufferedReader.readLine();
    }

    private void fdfd(){
        FacebookSdk.setApplicationId(dd[2]);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(sa16.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);

        AppEventsLogger.activateApp(sa16.getApplication());
        AppLinkData.fetchDeferredAppLinkData(sa16.getApplicationContext(),
                new AppLinkData.CompletionHandler() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onDeferredAppLinkDataFetched(AppLinkData jsdqqq) {
                        if (jsdqqq == null) {
                            jsdqqq = AppLinkData.createFromActivity(sa16);
                        }
                        if (jsdqqq != null) {
                            Uri url = jsdqqq.getTargetUri();
                            kqqw = url.getQuery();
                            jfdf = SA16.parrrr(kqqw,sa16.getPackageName(), Appsap.ldsj,Appsap.fd);

                        }else {

                        }
                    }

                }
        );
    }



}
