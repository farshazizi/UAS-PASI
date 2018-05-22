package com.qtaaruf.uaspasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void menuSatu(View view) {
        startActivity(new Intent(Main2Activity.this, MenuSatu.class));
    }

    public void menuDua(View view) {
        startActivity(new Intent(Main2Activity.this, MenuDua.class));
    }

    public void menuTiga(View view) {
        startActivity(new Intent(Main2Activity.this, MenuTiga.class));
    }

    public void menuEmpat(View view) {
        startActivity(new Intent(Main2Activity.this, MenuEmpat.class));
    }
}
