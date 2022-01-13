package com.richvtro.kijnghred.richking.kdk;

import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

import com.richvtro.kijnghred.richking.MainActivity;
import com.richvtro.kijnghred.richking.SA16;

public class WebClient extends WebViewClient {

    SA16 sa16;

    public WebClient(SA16 sa16) {
        this.sa16 = sa16;
    }

    @Override
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse kd) {
        if (kd.getStatusCode() == 404){
           sa16.startActivity(new Intent(sa16.getApplicationContext(), MainActivity.class));
           sa16.finishAffinity();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        sa16.getSharedPreferences(sa16.getPackageName(), sa16.MODE_PRIVATE).edit().putString(Dejdjs.de("c2F2ZWRVcmw="),url).apply();
    }
}
