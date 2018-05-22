package com.qtaaruf.uaspasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuDua extends AppCompatActivity {

    EditText editText_sisi1, editText_sisi2;
    Button btn_hitung2;
    TextView textView_hasil2;

    Double sisi1 = 0.0;
    Double sisi2 = 0.0;
    Double hasil2 = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dua);

        editText_sisi1 = (EditText) findViewById(R.id.editText_sisi1);
        editText_sisi2 = (EditText) findViewById(R.id.editText_sisi2);
        textView_hasil2 = (TextView) findViewById(R.id.textView_hasil2);
        btn_hitung2 = (Button) findViewById(R.id.btn_hitung2);
        btn_hitung2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sisi1 = Double.parseDouble(editText_sisi1.getText().toString());
                sisi2 = Double.parseDouble(editText_sisi2.getText().toString());

                hasil2 = sisi1 * sisi2;
//                String h_hasil = String.valueOf(hasil);
                textView_hasil2.setText(String.valueOf(hasil2));
            }
        });
    }
}
