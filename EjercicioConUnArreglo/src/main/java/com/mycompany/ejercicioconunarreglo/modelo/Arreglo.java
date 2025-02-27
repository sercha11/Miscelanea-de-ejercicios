package com.mycompany.ejercicioconunarreglo.modelo;

public class Arreglo {
    private int[] numero;

    @Override
    public String toString() {
        return "Arreglo{" + "numero=" + numero + '}';
    }

    public int[] getNumero() {
        return numero;
    }

    public void setNumero(int[] numero) {
        this.numero = numero;
    }

    public Arreglo() {
    }
  
    public int ObtenerNumeroMayor(int[] numero){
        int comparador = -999999;
       
        for(int i=0; i < numero.length ; i++){
            if(numero[i] > comparador) {
            comparador = numero[i];
            }
        }
        return comparador;
    }
    
    public int ObtenerNumeroMenor(int[] numero){
        int comparador = 999999;
       
        for(int i=0; i < numero.length ; i++){
            if(numero[i] < comparador) {
            comparador = numero[i];
            }
        }
        return comparador;
    }
    
     public double ObtenerPromedio(int[] numero){
        double suma = 0;
       
        for(int i=0; i <numero.length ; i++){
            suma += numero[i];
        }
        return suma/numero.length;
    }
}
