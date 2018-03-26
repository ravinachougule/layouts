package com.example.relativelayoutjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivity m=this;

        RelativeLayout.LayoutParams paramRoot=new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        RelativeLayout layout=new RelativeLayout(this);
        layout.setLayoutParams(paramRoot);

        RelativeLayout.LayoutParams paramBtn=new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        Button btn1=new Button(this);
        btn1.setText("Button1");
        btn1.setLayoutParams(paramBtn);
        layout.addView(btn1);

        RelativeLayout.LayoutParams paramBtn2=new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        Button btn2=new Button(this);
        btn2.setText("Button2");
        btn2.setLayoutParams(paramBtn2);
        layout.addView(btn2);

        setContentView(layout);

    }
}
