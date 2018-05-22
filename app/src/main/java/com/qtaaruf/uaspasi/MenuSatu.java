package com.qtaaruf.uaspasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuSatu extends AppCompatActivity {

    EditText editText_alas, editText_tinggi;
    Button btn_hitung;
    TextView textView_hasil;

    Double alas = 0.0;
    Double tinggi = 0.0;
    Double hasil = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_satu);

        editText_alas = (EditText) findViewById(R.id.editText_alas);
        editText_tinggi = (EditText) findViewById(R.id.editText_tinggi);
        textView_hasil = (TextView) findViewById(R.id.textView_hasil);
        btn_hitung = (Button) findViewById(R.id.btn_hitung);
        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alas = Double.parseDouble(editText_alas.getText().toString());
                tinggi = Double.parseDouble(editText_tinggi.getText().toString());

                hasil = (alas*tinggi) / 2;
//                String h_hasil = String.valueOf(hasil);
                textView_hasil.setText(String.valueOf(hasil));
            }
        });
    }
}
