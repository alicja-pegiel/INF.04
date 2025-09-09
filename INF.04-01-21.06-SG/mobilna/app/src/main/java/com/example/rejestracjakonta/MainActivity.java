package com.example.rejestracjakonta;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView komunikatTV = findViewById(R.id.komunikat);
        EditText emailET = findViewById(R.id.email);
        EditText hasloET = findViewById(R.id.haslo1);
        EditText powtorzHasloET = findViewById(R.id.haslo2);
        Button przyciskZatwierdz = findViewById(R.id.zatwierdz);

        przyciskZatwierdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String email = emailET.getText().toString();
                    String haslo = hasloET.getText().toString();
                    String powtorzHaslo = powtorzHasloET.getText().toString();
                    if (!(email.contains("@"))) {
                        komunikatTV.setText("Nieprawidłowy adres e-mail");
                    } else {
                        if (!haslo.equals(powtorzHaslo) || haslo.isEmpty()) {
                            komunikatTV.setText("Hasła się różnią");
                        }
                        else {
                            komunikatTV.setText("Witaj " + email);
                        }
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}