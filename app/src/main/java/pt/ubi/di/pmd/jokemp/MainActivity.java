package pt.ubi.di.pmd.jokemp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");
    }
public void selecionadoPapel(View view){
        this.opcaoSelecionada("papel");
    }
public void selecionadoesoura(View view){
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada    (String opcaoSelecionada){
        ImageView resultado = findViewById(R.id.resultado);
        TextView textResultado = findViewById(R.id.textResultado);
        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp=opcoes[numero];

        switch (opcaoApp){
            case "pedra" :
                resultado.setImageResource(R.drawable.pedra);
                break;

            case "papel" :
                resultado.setImageResource(R.drawable.papel);
                break;

                case "tesoura" :
                resultado.setImageResource(R.drawable.tesoura);
                break;
        }
        if (
                (opcaoApp == "tesoura" && opcaoSelecionada=="papel") ||
                (opcaoApp == "papel" && opcaoSelecionada=="pedra") ||
                (opcaoApp == "pedra" && opcaoSelecionada=="tesoura")
            )
        {
            textResultado.setText("Você perdeu!!");
        }
        else if(
                (opcaoSelecionada == "tesoura" && opcaoApp=="papel") ||
                (opcaoSelecionada == "papel" && opcaoApp=="pedra") ||
                (opcaoSelecionada == "pedra" && opcaoApp=="tesoura")
               )
        {
            textResultado.setText("Você ganhouu!");
        }
        else

        {
            textResultado.setText("Empatamos!!");
        }


    }
}
