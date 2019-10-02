package cl.ejercicios.ejemplo5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cl.ejercicios.ejemplo5.modelo.Bebida;

public class CategoriasActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Recuperamos el ListView
        ListView listaBebidas=getListView();

        //Creamos un ArrayAdapter para asociarlo con el arreglo
        ArrayAdapter<Bebida> listaAdapter= new ArrayAdapter<Bebida>(
                this,
                android.R.layout.simple_list_item_1,
                Bebida.bebidas);
        //Asociamos el ArrayAdapter al ListView
        listaBebidas.setAdapter(listaAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View view,
                                int posicion, long id)
    {
        Intent intent=new Intent(CategoriasActivity.this,
                BebidasActivity.class);
        intent.putExtra("bebidaNro",(int)id);
        startActivity(intent);
    }



}
