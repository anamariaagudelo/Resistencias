/*
@Ana MaRIA Agudelo Cadavid
@Jakeline Garcia Mesa
 Ingenieria de Sistemas
       2017-II
        */

package com.edu.udea.resistencias;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static com.edu.udea.resistencias.R.color.lightgray;

public class MainActivity extends AppCompatActivity {

    /*Declaracion de variables, de acuerdo al tipo*/
    private Button Blimpiar, Bnegro, Bmarron, Brojo, Bnaranja, Bamarillo, Bverde, Bazul, Bpurpura, Bgris, Bblanco, Bmasmarron, Bmasrojo, Bmasdorado, Bmasplateado, Resistencia, Inductor;
    private TextView Tprimero, Tsegundo, Ttercero, Tcuarto, Tresultado;
    private Integer contador = 0;
    private String First = " ", Second = " ", complete = " ";
    private Double Result = 0.0;

    @Override

   /* Metodo onCreate, en este se inicializan las variables de acuerdo a su tipo y se les asigna el id*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Blimpiar = (Button) findViewById(R.id.Blimpiar);
        Bnegro = (Button) findViewById(R.id.Bnegro);
        Bmarron = (Button) findViewById(R.id.Bmarron);
        Brojo = (Button) findViewById(R.id.Brojo);
        Bnaranja = (Button) findViewById(R.id.Bnaranja);
        Bamarillo = (Button) findViewById(R.id.Bamarillo);
        Bverde = (Button) findViewById(R.id.Bverde);
        Bazul = (Button) findViewById(R.id.Bazul);
        Bpurpura = (Button) findViewById(R.id.Bpurpura);
        Bgris = (Button) findViewById(R.id.Bgris);
        Bblanco = (Button) findViewById(R.id.Bblanco);
        Bmasmarron = (Button) findViewById(R.id.BmasMarron);
        Bmasrojo = (Button) findViewById(R.id.BmasRojo);
        Bmasdorado = (Button) findViewById(R.id.BmasDorado);
        Bmasplateado = (Button) findViewById(R.id.BmasPlateado);
        Tprimero = (TextView) findViewById(R.id.Tprimero);
        Tsegundo = (TextView) findViewById(R.id.Tsegundo);
        Ttercero = (TextView) findViewById(R.id.Ttercero);
        Tcuarto = (TextView) findViewById(R.id.Tcuarto);
        Tresultado = (TextView) findViewById(R.id.Tresultado);

        /*Se deshabilitan todos los botones de colores de la interface, para que al abrir la aplicaciòn no se pueda seleccionar
        * ninguno hasta que se elija la operacion a realizar*/
        Bnegro.setEnabled(false);
        Bmarron.setEnabled(false);
        Brojo.setEnabled(false);
        Bnaranja.setEnabled(false);
        Bamarillo.setEnabled(false);
        Bverde.setEnabled(false);
        Bazul.setEnabled(false);
        Bpurpura.setEnabled(false);
        Bgris.setEnabled(false);
        Bblanco.setEnabled(false);
        Bmasmarron.setEnabled(false);
        Bmasrojo.setEnabled(false);
        Bmasdorado.setEnabled(false);
        Bmasplateado.setEnabled(false);

        Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.red));
        Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.white));
        Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.darkmagenta));
        Tcuarto.setBackgroundColor(Tcuarto.getContext().getResources().getColor(R.color.greenyellow));

    }

/*Boton resistencia, al presionar este boton se hàbilitan todos los botones de colores para realizar las operaciones para el calculo de resistencia*/
    public void Resistencia(View view) {
        Bnegro.setEnabled(true);
        Bmarron.setEnabled(true);
        Brojo.setEnabled(true);
        Bnaranja.setEnabled(true);
        Bamarillo.setEnabled(true);
        Bverde.setEnabled(true);
        Bazul.setEnabled(true);
        Bpurpura.setEnabled(true);
        Bgris.setEnabled(true);
        Bblanco.setEnabled(true);
        Bmasmarron.setEnabled(true);
        Bmasrojo.setEnabled(true);
        Bmasdorado.setEnabled(true);
        Bmasplateado.setEnabled(true);

    }

    /*Boton inductor*/
    public void Inductor(View view) {
        Bnegro.setEnabled(true);
        Bmarron.setEnabled(true);
        Brojo.setEnabled(true);
        Bnaranja.setEnabled(true);
        Bamarillo.setEnabled(true);
        Bverde.setEnabled(true);
        Bazul.setEnabled(true);
        Bpurpura.setEnabled(true);
        Bgris.setEnabled(true);
        Bblanco.setEnabled(true);
        Bmasmarron.setEnabled(true);
        Bmasrojo.setEnabled(true);
        Bmasdorado.setEnabled(true);
        Bmasplateado.setEnabled(true);


    }

    /*Cada uno d elos botones de colores es programado, para que haga los calculos correspondientes a una resistencia de 4 bandas, de acuerdo a la ubicacion
    * del color y la tolerancia seleccionada*/
    public void Negro(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.black));
            contador += 1;
            First = "0";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.black));
            contador += 1;
            Second = "0";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.black));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) * 1;
        } else if (contador >= 3) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Marron(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.brown));
            contador += 1;
            First = "1";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.brown));
            contador += 1;
            Second = "1";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.brown));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) * 10;
        } else if (contador >= 3) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Rojo(View view) {
            if (contador == 0) {
                Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.red));
                contador += 1;
                First = "2";
            } else if (contador == 1) {
                Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.red));
                contador += 1;
                Second = "2";
            } else if (contador == 2) {
                Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.red));
                contador += 1;
                complete = First + Second;
                Result = Double.parseDouble(complete) * 100;
            } else if (contador >= 3) {
                Tresultado.setText("Error, No Valido, llego al limite de colores");
            }
    }

    public void Naranja(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.orange));
            contador += 1;
            First = "3";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.orange));
            contador += 1;
            Second = "3";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.orange));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) * 1000;
        } else if (contador >= 3) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Amarillo(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.yellow));
            contador += 1;
            First = "4";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.yellow));
            contador += 1;
            Second = "4";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.yellow));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) * 10000;
        } else if (contador >= 3) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Verde(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.greenyellow));
            contador += 1;
            First = "5";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.greenyellow));
            contador += 1;
            Second = "5";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.greenyellow));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) * 100000;
        } else if (contador >= 3) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Azul(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.blue));
            contador += 1;
            First = "6";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.blue));
            contador += 1;
            Second = "6";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.blue));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) * 1000000;
        } else if (contador >= 3) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Purpura(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.darkmagenta));
            contador += 1;
            First = "7";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.darkmagenta));
            contador += 1;
            Second = "7";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.darkmagenta));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) / 10;
        } else if (contador >= 3) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Gris(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.gainsboro));
            contador += 1;
            First = "8";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.gainsboro));
            contador += 1;
            Second = "8";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.gainsboro));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) / 100;
        } else if (contador >= 3) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Blanco(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.white));
            contador += 1;
            First = "9";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.white));
            contador += 1;
            Second = "9";
        } else if (contador >= 2) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    /*Los botones de colores uqe corresponden a la tolerancia no podran ser selecionado en las tres primeras bandas, solo se podra seleccionar en la
    * ultima banda, de lo contrario la aplicacion mostrara un mesaje de errror*/
    public void MasMarron(View view) {
        if (contador == 0) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 1) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 2) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 3) {
            Tcuarto.setBackgroundColor(Tcuarto.getContext().getResources().getColor(R.color.brown));
            contador += 1;
            Tresultado.setText("Resistencia de: " + Result + " Ohms y Tolerancia de +-1%");
        } else if (contador >= 4) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }

    }

    public void MasRojo(View view) {
        if (contador == 0) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 1) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 2) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 3) {
            Tcuarto.setBackgroundColor(Tcuarto.getContext().getResources().getColor(R.color.red));
            contador += 1;
            Tresultado.setText("Resistencia de: " + Result + " Ohms y Tolerancia de +-2%");
        } else if (contador >= 4) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void MasDorado(View view) {
        if (contador == 0) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 1) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 2) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 3) {
            Tcuarto.setBackgroundColor(Tcuarto.getContext().getResources().getColor(R.color.goldenrod));
            contador += 1;
            Tresultado.setText("Resistencia de: " + Result + " Ohms y Tolerancia de +-5%");
        } else if (contador >= 4) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void MasPlateado(View view) {
        if (contador == 0) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 1) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 2) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 3) {
            Tcuarto.setBackgroundColor(Tcuarto.getContext().getResources().getColor(lightgray));
            contador += 1;
            Tresultado.setText("Resistencia de: " + Result + " Ohms y Tolerancia de +-10%");
        } else if (contador >= 4) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }


    /*Boton Limpiar, el cual permite limpiar la pantalla de la aplicacion, al presionar este boton se limpia tanto el campo de texto en elque
    * se muestra el resultado como los colores que fueron seleccionados y regresa la pantalla al estado inicial, dejando 4 colores como determinados
    * rojo,blanco,purpura y verde, ademàs deshabilita todos los botones para ue el usuario pueda elegir cual de las dos operaciones quiere realizar
    * si el calculo de resistencias o el calculo de inductores*/
    public void Limpiar(View view) {
        Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.red));
        Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.white));
        Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.darkmagenta));
        Tcuarto.setBackgroundColor(Tcuarto.getContext().getResources().getColor(R.color.greenyellow));
        Tresultado.setText(" ");
        contador = 0;

        Bnegro.setEnabled(false);
        Bmarron.setEnabled(false);
        Brojo.setEnabled(false);
        Bnaranja.setEnabled(false);
        Bamarillo.setEnabled(false);
        Bverde.setEnabled(false);
        Bazul.setEnabled(false);
        Bpurpura.setEnabled(false);
        Bgris.setEnabled(false);
        Bblanco.setEnabled(false);
        Bmasmarron.setEnabled(false);
        Bmasrojo.setEnabled(false);
        Bmasdorado.setEnabled(false);
        Bmasplateado.setEnabled(false);
    }
}
