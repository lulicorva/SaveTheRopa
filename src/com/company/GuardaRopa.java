package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    private Map<Integer, List<Prenda>> prendas;
    private Integer contador;

    //Aca creo el diccionario vacio y el contador en cero
    public GuardaRopa(){
        prendas = new HashMap<>();
        contador = 0;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrendas){
        Integer nroIdentificador = contador;
        prendas.put(nroIdentificador,listaDePrendas);
        contador++;
        return nroIdentificador;
    }

    public void mostrarPrendas(){
        System.out.println("Prendas en el guardarropas :");
        for (Integer nroIdentificador : prendas.keySet()) {
            System.out.println(nroIdentificador + " - " + prendas.get(nroIdentificador).toString());
        }
    }

    public List<Prenda>devolverPrendas(Integer nroIdentificador){
        return prendas.remove(nroIdentificador);

    }
}
