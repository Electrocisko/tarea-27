package org.fjz.colleciones;

import java.util.Date;

public class Vuelo implements Comparable<Vuelo>{
    private String nombre;
    private String origin;
    private String destino;
    private Date fechaLlegada;
    private Integer pasajeros;

    public Vuelo(String nombre, String origin, String destino, Date fechaLlegada, Integer pasajeros) {
        this.nombre = nombre;
        this.origin = origin;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.pasajeros = pasajeros;
    }

    public Vuelo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Integer getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Integer pasajeros) {
        this.pasajeros = pasajeros;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "nombre='" + nombre + '\'' +
                ", origin='" + origin + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaLlegada=" + fechaLlegada +
                ", pasajeros=" + pasajeros +
                '}';
    }

    @Override
    public int compareTo(Vuelo vuelo) {
        return this.pasajeros.compareTo(vuelo.pasajeros);
    }
}
