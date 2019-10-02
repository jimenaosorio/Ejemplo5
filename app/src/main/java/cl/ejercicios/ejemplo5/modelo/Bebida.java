package cl.ejercicios.ejemplo5.modelo;

import cl.ejercicios.ejemplo5.R;

public class Bebida {
    private String nombre;
    private String descripcion;
    private int idFoto;

    public static final Bebida[] bebidas={
            new Bebida("Jugo natural",
                    "Manzana, kiwi y naranja",
                    R.drawable.jugo),
            new Bebida("Leche con fruta",
                    "Frutilla, piña, frambuesa y arandano",
                    R.drawable.leche),
            new Bebida("Bebida en lata",
                    "Fanta, Sprite, Coca cola normal, light y zero",
                    R.drawable.bebida)
    };


    public Bebida(String nombre, String descripcion, int idFoto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idFoto = idFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getIdFoto() {
        return idFoto;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
