package com.mycompany.ejerciciocirculo;

import com.mycompany.ejerciciocirculo.modelo.Circulo;

public class EjercicioCirculo {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRadio(2.5);
        
        System.out.println("El radio del circulo es: "+circulo.getRadio());
        System.out.println("Su area es: "+circulo.calcularArea());
        System.out.println("Su circunferencia es: "+circulo.calcularCircunferencia());
       
        
        
    }
}
