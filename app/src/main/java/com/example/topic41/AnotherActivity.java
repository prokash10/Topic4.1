package com.example.topic41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String capital=bundle.getString("capital");
            tv=findViewById(R.id.tvcapital);
            tv.setText(capital);
        }
        else
        {
            Toast.makeText(this,"No Capital Listed",Toast.LENGTH_SHORT).show();
        }
    }
}
