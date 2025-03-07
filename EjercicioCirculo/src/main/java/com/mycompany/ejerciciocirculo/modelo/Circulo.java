package com.mycompany.ejerciciocirculo.modelo;

public class Circulo {
    private double radio;
    
    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
       
        return Math.PI* Math.pow(radio, 2);
    }

    public double calcularCircunferencia(){
        return radio*2*Math.PI;
}

}