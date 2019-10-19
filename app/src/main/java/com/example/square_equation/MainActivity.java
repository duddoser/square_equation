package com.example.square_equation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickMyBtn(View view) {

        EditText a = findViewById(R.id.CoefA);
        String a_string = a.getText().toString();
        double a_dbl = Double.parseDouble(a_string);

        EditText b = findViewById(R.id.CoefB);
        String b_string = b.getText().toString();
        double b_dbl = Double.parseDouble(b_string);

        EditText c = findViewById(R.id.CoefC);
        String c_string = c.getText().toString();
        double c_dbl = Double.parseDouble(c_string);

        TextView answer = findViewById(R.id.Answer);
        answer.setText(equation(a_dbl, b_dbl, c_dbl));
    }

    String equation(double a, double b, double c) {

        double d = b * b - 4 * a * c;
        if (d == 0) {
            return (-b/(2 * a) + "");
        } else if (d > 0){
            return ((-b + Math.sqrt(d))/(2 * a) + "; " + (-b - Math.sqrt(d))/(2 * a));
        } else {
            return ("Корни уравнения отсутствуют");
        }

    }

}
