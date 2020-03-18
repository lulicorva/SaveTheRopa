package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Prenda unaPrenda = new Prenda("Bolivia","Cholita");
        Prenda otraPrenda = new Prenda("Como quieres", "Teenz");
        GuardaRopa guardaRopa = new GuardaRopa();

        List<Prenda>listaNuevasPrendas = new ArrayList<>();
        listaNuevasPrendas.add(unaPrenda);
        listaNuevasPrendas.add(otraPrenda);

        System.out.println(guardaRopa.guardarPrendas(listaNuevasPrendas));
        guardaRopa.mostrarPrendas();

        listaNuevasPrendas.add(unaPrenda);
        listaNuevasPrendas.add(otraPrenda);

        guardaRopa.mostrarPrendas();
    }
}
