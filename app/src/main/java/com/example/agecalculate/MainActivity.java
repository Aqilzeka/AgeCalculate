package com.example.agecalculate;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Calendar;
import android.icu.util.Output;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void buttonClicked(View buttonView){

        EditText edtage = findViewById(R.id.editText2);

        int myAge = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(edtage.getText().toString());
        TextView myAgeTextView = findViewById(R.id.txtMyYears);
        myAgeTextView.setText("Yasiniz :" + myAge + "");

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
