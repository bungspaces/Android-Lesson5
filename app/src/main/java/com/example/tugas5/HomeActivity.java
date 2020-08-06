package com.example.tugas5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
public TextView txDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        txDetail = (TextView) findViewById(R.id.txtDetail);
        txDetail.setText("");
        Bundle bundle = getIntent().getExtras();
        String s = bundle.getString("data_mhs");
        txDetail.setText(s);
    }
}
