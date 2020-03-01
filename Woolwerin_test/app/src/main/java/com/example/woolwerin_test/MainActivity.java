package com.example.woolwerin_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    static TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView) findViewById(R.id.input);
        tv2=(TextView) findViewById(R.id.output_text);


    }

    public void karthi(View view) {


        FetchData process=new FetchData();
        process.execute();
    }


}
