package com.example.maytinh1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;

import android.widget.TextView;

import android.widget.EditText;

import android.view.View;
public class MainActivity extends AppCompatActivity
{
    EditText N1, N2; //Khai báo biến
    TextView KQ;
    Button BT;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        N1 = (EditText)findViewById(R.id.EdtN1);
        N2 = (EditText)findViewById(R.id.EdtN2);
        KQ = (TextView)findViewById(R.id.TxtKq);
        BT = (Button) findViewById(R.id.BtnKq);

        BT.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
//Gán và chuyển kiểu các giá trị nhập vào
                Double A = Double.parseDouble(N1.getText().toString());
                Double B = Double.parseDouble(N2.getText().toString());
                KQ.setText("" + (A+B));//Hiển thị kết quả
            }
        });
    }

}
