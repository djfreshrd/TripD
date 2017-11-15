package edu.itla.tripdom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtNombre = findViewById(R.id.txtNombre);
        Button btnGuardar = findViewById(R.id.btnGurdar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtNombre.getText().toString();
                // Toast message = Toast.makeText(MainActivity.this, "Hola mundo", Toast.LENGTH_LONG);
                // message.show();

                Intent Visualizar = new Intent(  MainActivity.this, Visualizar.class);
                        Visualizar.putExtra("Nombre", nombre);
                startActivity(Visualizar);
            }
        });
    }

}
