package com.richvtro.kijnghred.richking.kdk;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;

import com.richvtro.kijnghred.richking.SA16;

public class WebChrome extends WebChromeClient {

    SA16 sa16;

    public WebChrome(SA16 sa16) {
        this.sa16 = sa16;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public boolean onShowFileChooser(WebView view,
                                     ValueCallback<Uri[]> iut,
                                     FileChooserParams loiu) {
        if (sa16.ksjdsdj != null) {
            sa16.ksjdsdj.onReceiveValue(null);
        }
        sa16.ksjdsdj = iut;
        Intent jkdsqw = new Intent(Intent.ACTION_GET_CONTENT);
        jkdsqw.addCategory(Intent.CATEGORY_OPENABLE);
        jkdsqw.setType("*/*");
        Intent[] loim = new Intent[0];
        Intent llll = new Intent(Intent.ACTION_CHOOSER);
        llll.putExtra(Intent.EXTRA_INTENT, jkdsqw);
        llll.putExtra(Intent.EXTRA_TITLE, Dejdjs.de("U2VsZWN0IE9wdGlvbjo="));
        llll.putExtra(Intent.EXTRA_INITIAL_INTENTS, loim);
        sa16.startActivityForResult(llll, 1);
        return true;
    }
}
