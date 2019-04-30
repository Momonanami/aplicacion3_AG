package com.example.a19134355_7.aplicacion3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.buttonMain);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               Toast.makeText(MainActivity.this,"Click en el boton",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void miMetodo(View v)
    {
        Toast.makeText(MainActivity.this,"Clic en el boton",Toast.LENGTH_LONG).show();
    }
}
