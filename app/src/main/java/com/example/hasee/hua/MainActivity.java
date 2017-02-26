package com.example.hasee.hua;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {

    private Button btn;
    private MyView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        view = (MyView) findViewById(R.id.draw);
        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                view.clear();
            }
        });
    }

}
