package com.qtaaruf.uaspasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuTiga extends AppCompatActivity {

    EditText editText_panjang;
    Button btn_hitung3;
    TextView textView_hasil3;

    Double jari = 0.0;
    Double hasil3 = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tiga);

        editText_panjang = (EditText) findViewById(R.id.editText_jari);
        textView_hasil3 = (TextView) findViewById(R.id.textView_hasil3);
        btn_hitung3 = (Button) findViewById(R.id.btn_hitung3);
        btn_hitung3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jari = Double.parseDouble(editText_panjang.getText().toString());

                hasil3 = (22 * jari) /7;

                textView_hasil3.setText(String.valueOf(hasil3));
            }
        });
    }
}
