package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declarando variáveis que representam os objetos no xml
    EditText edtUsuario, edtSenha;
    Button btnEntrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //abrindo a minha activity
        setContentView(R.layout.activity_main);

        //referenciando o id no xml
        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);

        btnEntrar = findViewById(R.id.btnEntrar);

        //ação do botão entrar
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // v = variável tipo view
                Toast.makeText(getApplicationContext(),
                        "Bem vindo ao sistema",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void sairSistema(View view) {

        finish(); //finalizando a activity
    }
}