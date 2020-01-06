package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirst,etSecond;
    Button btnCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding
        etFirst = findViewById(R.id.etFirst);
        etSecond= findViewById(R.id.etSecond);
        btnCalculate= findViewById(R.id.btnCalculate);
        tvResult= findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etFirst.getText())) {
                    etFirst.setError("please enter first no");
                    return;
                }else if (TextUtils.isEmpty(etSecond.getText())){
                    etSecond.setError("please enter second no");
                    return;
                }

                int first,second,result;
                first= Integer.parseInt(etFirst.getText().toString());
                second= Integer.parseInt(etSecond.getText().toString());
               /* result= first + second;
                tvResult.setText(result+ "");*/

                Arithmetic arithmetic;
                arithmetic = new Arithmetic(first, second);
                /*arithmetic.first=first;
                arithmetic.second=second;*/
                result= arithmetic.add();

                String str= "Result of" + first + "and" + second + "is : " + result + "\n";
                tvResult.append(str);
            }
        });

    }
}
