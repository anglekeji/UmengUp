package com.umengup.main;

import com.umeng.update.UmengUpdateAgent;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        //UmengUpdateAgent.setUpdateOnlyWifi(false);//无论什么网络环境下都提醒，默认只在wifi下提醒
        UmengUpdateAgent.update(this);     
    }

}
