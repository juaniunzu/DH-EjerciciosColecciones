package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //ejercicio 3
        ArrayList<Integer> unaLista = new ArrayList<Integer>();


        unaLista.add(1);
        unaLista.add(5);
        unaLista.add(5);
        unaLista.add(6);
        unaLista.add(7);
        unaLista.add(8);
        unaLista.add(8);
        unaLista.add(8);

        /*
        for (Integer integer : unaLista) {
            System.out.println(integer);
        }

         */

        //ejercicio 4
        HashSet<Integer> unConjunto = new HashSet<Integer>();

        unConjunto.add(1);
        unConjunto.add(5);
        unConjunto.add(5);
        unConjunto.add(6);
        unConjunto.add(7);
        unConjunto.add(8);
        unConjunto.add(8);
        unConjunto.add(8);

        /*
        for (Integer integer : unConjunto) {
            System.out.println(integer);
        }

         */

        //ejercicio 5
        ArrayList<Integer> losPrimerosCien = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            losPrimerosCien.add(i);
        }

        /*
        for (Integer integer : losPrimerosCien) {
            System.out.println(integer);
        }

         */

        //ejercicio 6
        HashSet<Integer> cienVecesElNumero1 = new HashSet<Integer>();

        for (int i = 1; i <= 100; i++) {
            cienVecesElNumero1.add(1);
        }
        /*
        for (Integer integer : cienVecesElNumero1) {
            System.out.println(integer);
        }

         */




    }
}
