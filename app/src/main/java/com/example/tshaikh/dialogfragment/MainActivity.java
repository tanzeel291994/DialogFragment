package com.example.tshaikh.dialogfragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends Activity {
public static DisplayMetrics displayMetrics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     displayMetrics =getResources().getDisplayMetrics();
        if (savedInstanceState == null)
        {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            Fragment_a hello = new Fragment_a();
            fragmentTransaction.add(R.id.fragment_container, hello, "fragment a");
            fragmentTransaction.commit();
        }
        //showEditDialog();
    }




}
