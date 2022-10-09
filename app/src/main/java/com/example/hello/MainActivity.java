package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

    private static final String ACTIVITY_TAG = "ch4_4_MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.test);



    }

    int size=30;
    public void bigger(View v){  // 按钮对应的 onclick 响应
        TextView txv;
        txv= (TextView) findViewById(R.id.txv);
        txv.setTextSize(++size);
    }

    public void display(View v){     // 另外一个按钮对应的 onclick 响应
        EditText name= (EditText) findViewById(R.id.name);
        TextView text2= (TextView) findViewById(R.id.txv);

        text2.setText(name.getText().toString());
    }

}