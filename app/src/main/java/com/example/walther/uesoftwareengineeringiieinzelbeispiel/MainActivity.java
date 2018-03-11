package com.example.walther.uesoftwareengineeringiieinzelbeispiel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Test
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final EditText EditText = findViewById(R.id.editText);
        final TextView TextViewError = findViewById(R.id.textViewErr);


        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String inString = EditText.getText().toString();
                if(inString.length()<5){
                    TextViewError.setText(R.string.errNoLong);

                }else {
                    if (isPalindrome(inString)) {
                        TextViewError.setText(R.string.isPalindrom);
                    } else {
                        TextViewError.setText(R.string.isNoPalindrom);
                    }
                }



               // TextViewError.setText(inString);

            }
        });



    }





    public static boolean isPalindrome(String str)	{
        return str.equals(new StringBuilder(str).reverse().toString());
    }





}
