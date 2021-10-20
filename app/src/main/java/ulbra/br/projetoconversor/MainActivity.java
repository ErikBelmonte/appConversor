package ulbra.br.projetoconversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText edtDinheiro;
    private Button btnConverter;
    private TextView txtResult1, txtResult2, txtResult3, txtResult4;
    public double valorInfo, valorOuro, valorDolar, valorEuro, valorBC;
    public String textOuro = "";
    DecimalFormat f = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        iniciarComponentes();
        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorInfo = Double.parseDouble(edtDinheiro.getText().toString());
                valorDolar = valorInfo * 5.60;
                valorEuro = valorInfo * 6.52;
                valorBC = valorInfo * 369826.16;
                valorOuro = valorInfo * 0.0031387319;

                txtResult1.setText("Dolar: $"+f.format(valorDolar));
                txtResult2.setText("Euro: €"+f.format(valorEuro));
                txtResult3.setText("BitCoin: ₿"+f.format(valorBC));
                txtResult4.setText("Ouro em quilates: "+f.format(valorOuro));
            }
        });
    }

    private void iniciarComponentes(){
        edtDinheiro = findViewById(R.id.edtDinheiro);
        btnConverter = findViewById(R.id.btnConverter);
        txtResult1 = findViewById(R.id.txtResult1);
        txtResult2 = findViewById(R.id.txtResult2);
        txtResult3 = findViewById(R.id.txtResult3);
        txtResult4 = findViewById(R.id.txtResult4);
    }
}