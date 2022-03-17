package ru.alekstereh.variables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView _resul;
    private EditText txt1;
    private EditText txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //присваеваем переменные
        _resul = findViewById(R.id.textView);
        txt1 = findViewById(R.id.n_1);
        txt2 = findViewById(R.id.n_2);

    }

    //слушатель кнопки результат
    public void onClickResult(View view) {

        int n1 = Integer.parseInt(txt1.getText().toString());
        int n2 = Integer.parseInt(txt2.getText().toString());
        int resul = n1 + n2;
        _resul.setText(String.valueOf(resul));

    }
}