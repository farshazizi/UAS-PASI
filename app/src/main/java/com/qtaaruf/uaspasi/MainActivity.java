package com.qtaaruf.uaspasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText_username, editText_password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_username = (EditText) findViewById(R.id.editText_username);
        editText_password = (EditText) findViewById(R.id.editText_password);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText_username.getText().toString().equals("Admin") && editText_password.getText().toString().equals("admin")) {
                    startActivity(new Intent(MainActivity.this, Main2Activity.class));
                    editText_username.setText("");
                    editText_password.setText("");
                    Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Username dan Password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
