package com.example.andreza.enderecosizi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivityEndIZI extends AppCompatActivity {
    private EditText textoque;
    private EditText textNomeLoja;
    private EditText textEndLoja;
    private Button btnCadastrar;
    private Button btnExibir;
    private TextView txtFinal;
    private List<Fornecedor> fornecedor = new ArrayList<>();
    private Fornecedor[] fornecedores;
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_end_izi);
        this.textoque = findViewById(R.id.id_edit_oQueViu);
        this.textNomeLoja = findViewById(R.id.id_edit_nomeLoja);
        this.textEndLoja = findViewById(R.id.id_edit_enderecoLoja);
        this.btnCadastrar = findViewById(R.id.id_btn_cadastrar);
        this.btnExibir = findViewById(R.id.id_btn_mostrarTudo);
        this.txtFinal = findViewById(R.id.id_text_final);
    }

    public void cadastrar(View view){
    String oque = this.textoque.getText().toString();
    String nomeLoja = this.textNomeLoja.getText().toString();
    String endLoja = this.textEndLoja.getText().toString();

    Fornecedor fornecedor = new Fornecedor(oque, nomeLoja, endLoja);
    fornecedor.add(fornecedor);

    textoque.setText("");
    textNomeLoja.setText("");
    textEndLoja.setText("");

    Toast.makeText(this, "É isso ai mamae linda, mais um cadastrado!", Toast.LENGTH_SHORT).show();

    public void exibir(View view){
        String textoCompleto = "";
        for (Fornecedor fornecedor:fornecedores){
            textoCompleto = textoCompleto+fornecedor.toString();
        }
        txtFinal.setText(textoCompleto);
        }

}

