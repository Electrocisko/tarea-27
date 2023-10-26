package org.fjz;

import org.fjz.colleciones.Vuelo;

import java.util.*;

public class TestVuelos {
    public static void main(String[] args) {

        Vuelo v1 = new Vuelo("AAL 933", "New York", "Santiago",
                new Date(2021, 7, 29, 5, 39), 62);
        Vuelo v2 = new Vuelo("LAT 755", "Sao Paulo", "Santiago",
                new Date(2021, 07, 31, 4, 45), 47);
        Vuelo v3 = new Vuelo("SKU 621", "Rio De Janeiro", "Santiago",
                new Date(20, 07, 30, 16, 0), 52);
        Vuelo v4 = new Vuelo("DAL 147", "Atlanta", "Santiago",
                new Date(21, 07, 29, 13, 22), 59);
        Vuelo v5 = new Vuelo("AVA 241", "Bogota", "Santiago",
                new Date(21, 07, 31, 14, 5), 25);
        Vuelo v6 = new Vuelo("AMX 10", "Mexico City", "Santiago",
                new Date(21, 07, 31, 5, 20), 29);
        Vuelo v7 = new Vuelo("IBE 6833", "Londres", "Santiago",
                new Date(21, 07, 30, 8, 45), 55);
        Vuelo v8 = new Vuelo("LAT 2479", "Frankfurt", "Santiago",
                new Date(21, 07, 29, 7, 41), 51);
        Vuelo v9 = new Vuelo("SKU 803", "Lima", "Santiago",
                new Date(21, 07, 30, 10, 35), 48);
        Vuelo v10 = new Vuelo("LAT 533", "Los Ángeles", "Santiago",
                new Date(21, 07, 29, 9, 14), 59);
        Vuelo v11 = new Vuelo("LAT 1447", "Guayaquil", "Santiago",
                new Date(21, 07, 31, 8, 33), 31);
        Vuelo v12 = new Vuelo("CMP 111", "Panama City", "Santiago",
                new Date(21, 07, 31, 15, 15), 29);
        Vuelo v13 = new Vuelo("LAT 705", "Madrid", "Santiago",
                new Date(21, 07, 30, 8, 14), 47);
        Vuelo v14 = new Vuelo("AAL 957", "Miami", "Santiago",
                new Date(21, 07, 29, 22, 53), 60);
        Vuelo v15 = new Vuelo("ARG 5091", "Buenos Aires", "Santiago",
                new Date(21, 07, 31, 9, 57), 32);
        Vuelo v16 = new Vuelo("LAT 1283", "Cancún", "Santiago",
                new Date(21, 07, 31, 4, 0), 35);
        Vuelo v17 = new Vuelo("LAT 579", "Barcelona", "Santiago",
                new Date(21, 07, 29, 7, 45), 61);
        Vuelo v18 = new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago",
                new Date(21, 07, 30, 7, 12), 58);
        Vuelo v19 = new Vuelo("LAT 501", "París", "Santiago",
                new Date(21, 07, 29, 18, 29), 49);
        Vuelo v20 = new Vuelo("LAT 405", "Montevideo", "Santiago",
                new Date(21, 07, 30, 15, 45), 39);


        List<Vuelo> arribos = new ArrayList<>();
        arribos.add(v1);
        arribos.add(v2);
        arribos.add(v3);
        arribos.add(v4);
        arribos.add(v5);
        arribos.add(v6);
        arribos.add(v7);
        arribos.add(v8);
        arribos.add(v9);
        arribos.add(v10);
        arribos.add(v11);
        arribos.add(v12);
        arribos.add(v13);
        arribos.add(v14);
        arribos.add(v15);
        arribos.add(v16);
        arribos.add(v17);
        arribos.add(v18);
        arribos.add(v19);
        arribos.add(v20);

        System.out.println("arribos = " + arribos);

        arribos.forEach(System.out::println);
        System.out.println("________________Por pasajeros____________________________________________________________________");
        Collections.sort(arribos);
        Collections.reverse(arribos);
        arribos.forEach(System.out::println);
        System.out.println("_________________Ordenado por llegadas_________________________________________");
        Collections.sort(arribos,(a,b) -> b.getFechaLlegada().compareTo(a.getFechaLlegada()));
        arribos.forEach(System.out::println);
    }


}