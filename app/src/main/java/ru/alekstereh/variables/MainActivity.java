package ru.alekstereh.variables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "COMPARER";

//    private TextView _resul;
//    private EditText txt1;
//    private EditText txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //присваеваем переменные
        TextView txt_resul = findViewById(R.id.textView);
        EditText txt1 = findViewById(R.id.n_1);
        EditText txt2 = findViewById(R.id.n_2);
        Button btn = findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputOneValue = txt1.getText().toString();
                String inputTwoValue = txt2.getText().toString();

                try {
                    Integer intOne = Integer.valueOf(inputOneValue);
                    Integer intTwo = Integer.valueOf(inputTwoValue);

                    Log.v(TAG, "Input " + intOne + " and " + intTwo);

                    if (intOne.equals(intTwo)) {
                        txt_resul.setText("Равно!");
                    } else {
                        txt_resul.setText("Не равно!");
                    }
                } catch (NumberFormatException exception) {
                    txt_resul.setText("Введите число!");
                }

            }
        });

    }


    //слушатель кнопки результат
//    public void onClickResult(View view) {
//
//        int n1 = Integer.parseInt(txt1.getText().toString());
//        int n2 = Integer.parseInt(txt2.getText().toString());
//        int resul = n1 + n2;
//        xtx_resul.setText(String.valueOf(resul));
//
//    }
}