package com.mycompany.vuelos.modelo;

import java.util.ArrayList;

public class Vuelo {
    private int numeroVuelo;
    private String origen;
    private String destino;
    private ArrayList<String> pasajeros;

    public Vuelo(int numeroVuelo, String origen, String destino) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.pasajeros = new ArrayList<>();
    }

    public Vuelo() {
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ArrayList<String> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<String> pasajeros) {
        this.pasajeros = pasajeros;
    }
   
    public void agregarPasajeros(String nombre){
        pasajeros.add(nombre);
        
    }
    
    public void mostrarPasajeros(){
        System.out.println("Pasajeros del vuelo "+numeroVuelo+ ": "+pasajeros );
    }
    
    public boolean buscarPasajero(String nombre){
        return pasajeros.contains(nombre);
    }
    
    public Vuelo buscarVuelo(Vuelo[] vuelos, int numeroVuelo){
        for(Vuelo v: vuelos){
            if(v.numeroVuelo == numeroVuelo){
                return v;
            }
        }
        return null;
    }
    
  

}
