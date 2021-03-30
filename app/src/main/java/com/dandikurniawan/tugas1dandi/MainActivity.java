package com.dandikurniawan.tugas1dandi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNpm, edtNama, edtJenisKelamin, edtNoTelp;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtNpmNamaJenisKelaminNoTelp);

        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtJenisKelamin = (EditText) findViewById(R.id.edtJenisKelamin);
        edtNoTelp = (EditText) findViewById(R.id.edtNoTelp);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strJenisKelamin = edtJenisKelamin.getText().toString();
                String strNoTelp = edtNoTelp.getText().toString();

                txtTampil.setText(strNpm + "\n" + strNama + "\n" + strJenisKelamin + "\n" + strNoTelp);

            }
        });
    }
}