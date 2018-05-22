package com.qtaaruf.uaspasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuEmpat extends AppCompatActivity {

    EditText editText_diagonal1, editText_diagonal2;
    Button btn_hitung4;
    TextView textView_hasil4;

    Double diagonal1 = 0.0;
    Double diagonal2 = 0.0;
    Double hasil = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_empat);

        editText_diagonal1 = (EditText) findViewById(R.id.editText_diagonal1);
        editText_diagonal2 = (EditText) findViewById(R.id.editText_diagonal2);
        textView_hasil4 = (TextView) findViewById(R.id.textView_hasil4);
        btn_hitung4 = (Button) findViewById(R.id.btn_hitung4);
        btn_hitung4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diagonal1 = Double.parseDouble(editText_diagonal1.getText().toString());
                diagonal2 = Double.parseDouble(editText_diagonal2.getText().toString());

                hasil = 0.5 * diagonal1 * diagonal2;

                textView_hasil4.setText(String.valueOf(hasil));
            }
        });
    }
}
