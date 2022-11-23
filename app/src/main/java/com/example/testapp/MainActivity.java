package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

    TextView textView;
    EditText edtUsername,edtPassword;
    Button btnLogin, btnLogin1;


    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setPadding(20,20,20,20);
        linearLayout.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        linearLayout.setLayoutParams(layoutParams);

        textView = new TextView(this);

        textView.setText("Welcome To Android Batch!");
        textView.setTextColor(Color.BLACK);
        textView.setBackgroundColor(Color.WHITE);
        textView.setTextSize(24);


        ViewGroup.LayoutParams layoutParamsForChildViews = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        textView.setLayoutParams(layoutParamsForChildViews);
        linearLayout.addView(textView);

        edtUsername = new EditText(this);
        edtUsername.setHint("Enter username");
        edtUsername.setTextColor(Color.RED);
        edtUsername.setBackgroundColor(Color.GRAY);
        edtUsername.setTextSize(30);

        edtUsername.setLayoutParams(layoutParamsForChildViews);
        linearLayout.addView(edtUsername);

        edtPassword = new EditText(this);
        edtPassword.setHint("Enter password");
        edtPassword.setTextColor(Color.BLUE);
        edtPassword.setBackgroundColor(Color.WHITE);

        edtPassword.setLayoutParams(layoutParamsForChildViews);
        linearLayout.addView(edtPassword);

        btnLogin = new Button(this);
        btnLogin.setText("Login");
        btnLogin.setTextColor(Color.WHITE);
        btnLogin.setBackgroundColor(Color.BLACK);
        btnLogin.setTextSize(16);

        btnLogin.setLayoutParams(layoutParamsForChildViews);
        linearLayout.addView(btnLogin);

        setContentView(linearLayout);

        /*way 2
        View.OnClickListener listener = new MyOnClickListener();
        btnLogin.setOnClickListener(listener);
        textView.setOnClickListener(listener);
         */


        /*way 3 - implementing at class level
        textView.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
         */

        //way 1
        textView.setOnClickListener(new TextViewClickListener());
        btnLogin.setOnClickListener(new BtnLoginClickListener());

    }

    @Override
    public void onClick(View view) {
        if(view == textView){
            textView.setText("");
        }
        if(view == btnLogin){
            if(edtUsername.getText().toString().equals("bitcode")&& edtPassword.getText().toString().equals("bitcode123")){
                textView.setText("Welcome "+edtUsername.getText().toString());
            }
        }
    }

    class MyOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(view == textView){
                textView.setText("");
            }
            if(view == btnLogin){
                if(edtUsername.getText().toString().equals("bitcode") && edtPassword.getText().toString().equals("bitcode123")){
                    textView.setText("Welcome "+edtUsername.getText().toString());
                } else {
                    textView.setText("");
                }
            }
        }
    }

    class TextViewClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            textView.setText("");
        }
    }

    class BtnLoginClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            if(edtUsername.getText().toString().equals("bitcode") && edtPassword.getText().toString().equals("bitcode123")){
                textView.setText("Welcome " + edtUsername.getText().toString());
            } else {
                textView.setText("Login Failed!");
            }
        }
    }
}