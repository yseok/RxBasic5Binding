package com.yuseok.android.rxbasic5binding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

import com.jakewharton.rxbinding2.widget.RxTextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RxTextView.textChangeEvents((EditText) findViewById(R.id.search))
                .subscribe(
                        word -> Log.e("search word", word.text().toString())
        );
    }
}
