package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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

        TextView textView = new TextView(this);

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

        EditText edtUsername = new EditText(this);
        edtUsername.setHint("Enter username");
        edtUsername.setTextColor(Color.RED);
        edtUsername.setBackgroundColor(Color.GRAY);
        edtUsername.setTextSize(30);

        edtUsername.setLayoutParams(layoutParamsForChildViews);
        linearLayout.addView(edtUsername);

        EditText edtPassword = new EditText(this);
        edtPassword.setHint("Enter password");
        edtPassword.setTextColor(Color.BLUE);
        edtPassword.setBackgroundColor(Color.WHITE);

        edtPassword.setLayoutParams(layoutParamsForChildViews);
        linearLayout.addView(edtPassword);

        Button btnSubmit = new Button(this);
        btnSubmit.setText("Login");
        btnSubmit.setTextColor(Color.WHITE);
        btnSubmit.setBackgroundColor(Color.BLACK);

        btnSubmit.setLayoutParams(layoutParamsForChildViews);
        linearLayout.addView(btnSubmit);

        setContentView(linearLayout);
    }
}