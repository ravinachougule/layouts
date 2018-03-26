package com.example.layoutjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.security.KeyStore;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivity m=this;

        LinearLayout.LayoutParams paramRoot=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        LinearLayout layout=new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(paramRoot);

        LinearLayout.LayoutParams paramEt=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        EditText etUserName=new EditText(m);
        etUserName.setHint("Enter User Name");
        etUserName.setLayoutParams(paramEt);
        layout.addView(etUserName);

        LinearLayout.LayoutParams paramEt1=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        EditText etPass=new EditText(m);
        etPass.setHint("Enter Password");
        //etPass.setInputType(Integer.parseInt(EditText.AUTOFILL_HINT_PASSWORD));
        etPass.setLayoutParams(paramEt1);
        layout.addView(etPass);

        LinearLayout.LayoutParams paramBtn=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        Button btnLogin=new Button(this);
        btnLogin.setText("Login");
        btnLogin.setLayoutParams(paramBtn);
        layout.addView(btnLogin);

        setContentView(layout);
    }
}
