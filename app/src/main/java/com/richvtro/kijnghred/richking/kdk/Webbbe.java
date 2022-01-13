package com.richvtro.kijnghred.richking.kdk;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;

import com.richvtro.kijnghred.richking.Appsap;
import com.richvtro.kijnghred.richking.MainActivity;
import com.richvtro.kijnghred.richking.SA16;

public class Webbbe {


    public WebView webViewssksue;
    public SA16 sa16;

    public Webbbe(WebView webViewssksue, SA16 sa16) {
        this.webViewssksue = webViewssksue;
        this.sa16 = sa16;
    }

    public void wws(){

     CookieManager.getInstance().setAcceptThirdPartyCookies(webViewssksue, true);
     CookieManager.getInstance().setAcceptCookie(true);
     webViewssksue.setVisibility(View.VISIBLE);
     webViewssksue.getSettings().setAllowFileAccessFromFileURLs(true);
     webViewssksue.getSettings().setSavePassword(true);
     webViewssksue.getSettings().setDatabaseEnabled(true);
     webViewssksue.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
     webViewssksue.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
     webViewssksue.getSettings().setAppCacheEnabled(true);
     webViewssksue.getSettings().setLoadsImagesAutomatically(true);
     webViewssksue.setSaveEnabled(true);
     webViewssksue.getSettings().setMixedContentMode(0);
     webViewssksue.setFocusable(true);
     webViewssksue.getSettings().setAllowUniversalAccessFromFileURLs(true);
     webViewssksue.getSettings().setJavaScriptEnabled(true);
     webViewssksue.getSettings().setAllowContentAccess(true);
     webViewssksue.getSettings().setLoadWithOverviewMode(true);
     webViewssksue.getSettings().setEnableSmoothTransition(true);
     webViewssksue.getSettings().setUseWideViewPort(true);
     webViewssksue.getSettings().setSaveFormData(true);
     webViewssksue.getSettings().setAllowFileAccess(true);
     webViewssksue.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
     webViewssksue.getSettings().setDomStorageEnabled(true);
     webViewssksue.setFocusableInTouchMode(true);
     webViewssksue.setWebViewClient(new WebClient(sa16));
     webViewssksue.setWebChromeClient(new WebChrome(sa16));
 }

 @RequiresApi(api = Build.VERSION_CODES.O)
 public void soro(String uuuu, String kkkkk){


     String jssd = Appsap.ljj;
     String kurw = null;
     if (jssd.equals(Dejdjs.de("Tm9uLW9yZ2FuaWM="))){
         kurw = uuuu + Appsap.qwqw;
         webViewssksue.loadUrl(kurw);
     }else if(Nds.kqqw != null) {
         kurw = uuuu + Nds.jfdf;
         webViewssksue.loadUrl(kurw);
     }else {
         if (kkkkk.equals(Dejdjs.de("Tk8="))) {
             sa16.startActivity(new Intent(sa16.getApplicationContext(), MainActivity.class));
             sa16.finishAffinity();
         }else {
             String kisdh = kkkkk + Dejdjs.de("P2J1bmRsZT0=") + sa16.getPackageName() + Dejdjs.de("JmFkX2lkPQ==") + Appsap.ldsj + Dejdjs.de("JmFwcHNfaWQ9") + Appsap.fd;
             kurw = uuuu + kisdh;
             webViewssksue.loadUrl(kurw);
         }
     }

 }


}
