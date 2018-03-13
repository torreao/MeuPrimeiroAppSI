package br.usjt.progmulti.clientesi18;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetalheClienteActivity extends Activity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_cliente);
        TextView nomeSelecionado = (TextView) findViewById(R.id.nome_selecionado);
        Intent intent = getIntent();
        nomeSelecionado.setText(intent.getStringExtra(ListaClientesActivity.NOME));
    }

}
