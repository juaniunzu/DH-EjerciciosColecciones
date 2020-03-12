package com.company;

import java.util.List;
import java.util.Set;

public class Prueba {

  public void imprimirPorPantalla(List<String> nombres){
    for (String nombre : nombres) {
      System.out.println("El nombre del alumno es " + nombre);
    }
  }

  public void sumaTotal(Set<Integer> conjuntoDeEnteros){
    int suma = 0;
    for (Integer enteros : conjuntoDeEnteros) {
      suma += enteros;
      System.out.println(suma);
    }

  }


}
