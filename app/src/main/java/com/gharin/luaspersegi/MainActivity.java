package com.gharin.luaspersegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText one, two;
    TextView results;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        results = findViewById(R.id.results);
        click = findViewById(R.id.click);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (one.getText().toString().isEmpty() || two.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "tidak boleh kosong, tolong di isi semua", Toast.LENGTH_SHORT).show();
                }else {
                    kali();
                }
            }
        });


    }

    void kali() {
        int angka1 = Integer.parseInt(one.getText().toString());
        int angka2 = Integer.parseInt(two.getText().toString());

        int total = angka1 * angka2;
        results.setText(String.valueOf(total));

    }
}
