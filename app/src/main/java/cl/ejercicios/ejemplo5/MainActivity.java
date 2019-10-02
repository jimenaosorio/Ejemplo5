package cl.ejercicios.ejemplo5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Crear un ItemClickListener

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    //Bebida
                    Intent intent=new Intent(MainActivity.this, CategoriasActivity.class);
                    startActivity(intent);
                }
            }
        };
        //Recuperamos el ListView
        ListView listView=(ListView) findViewById(R.id.lista_opciones);
        //Asociamos el ListView con el ItemClickListener
        listView.setOnItemClickListener(itemClickListener);
    }
}
