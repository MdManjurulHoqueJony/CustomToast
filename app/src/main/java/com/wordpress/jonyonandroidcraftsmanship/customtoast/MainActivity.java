package com.wordpress.jonyonandroidcraftsmanship.customtoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showToast(View view) {
        Toast toast=new Toast(this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 0, 0);

        LayoutInflater layoutInflater=getLayoutInflater();
        View toastAppearance=layoutInflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.ll_Toast));
        toast.setView(toastAppearance);
        toast.show();
    }
}
