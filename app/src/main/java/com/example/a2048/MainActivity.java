package com.example.a2048;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final String MAIN_ACTIVITY_TAG = "2048_MainActivity";

    private WebView mWebView;
    private long mLastBackPress;
    private static final long mBackPressThreshold = 3500;
    private static final String IS_FULLSCREEN_PREF = "is_fullscreen_pref";
    private long mLastTouch;
    private static final long mTouchThreshold = 2000;
    private Toast pressBackToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mWebView.loadUrl("file:///android_asset/2048/index.html?lang=" + Locale.getDefault().getLanguage());
    }

    @SuppressLint("MissingSuperCall")
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        mWebView.saveState(outState);
    }

}