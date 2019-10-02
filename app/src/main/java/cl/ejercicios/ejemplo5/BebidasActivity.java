package cl.ejercicios.ejemplo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import cl.ejercicios.ejemplo5.modelo.Bebida;

public class BebidasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        //Obtener la bebida desde el Intent
        int bebidaNro=(Integer)getIntent().getExtras().get("bebidaNro");
        Bebida bebida=Bebida.bebidas[bebidaNro];

        //Recuperar la imagen y mostrarla
        ImageView foto=(ImageView)findViewById(R.id.foto);
        foto.setImageResource(bebida.getIdFoto());
        foto.setContentDescription(bebida.getNombre());

        //Nombre de la bebida
        TextView nombre=(TextView)findViewById(R.id.nombre);
        nombre.setText(bebida.getNombre());

        //Descripción
        TextView descripcion=(TextView)findViewById(R.id.descripcion);
        descripcion.setText(bebida.getDescripcion());
    }
}
