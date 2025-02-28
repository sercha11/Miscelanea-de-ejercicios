package com.mycompany.promediodecalificaciones.modelo;

public class Estudiante {
    private String nombre;
    private int edad;
    private int [] calificaciones;

    public Estudiante() {
        this.calificaciones = new int[5];
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        if(calificaciones.length !=5){
            System.out.println("Solo se pueden ingresar 5 calificaciones, si un promedio da 0.0 es porque excede la capacidad del arreglo");
        } else {
        this.calificaciones = calificaciones;
        }
    }
    
    public double calcularPromedio(int[] calificaciones){
        double suma =0;
        for(int i=0; i<calificaciones.length; i++) {
              suma = suma + calificaciones[i];
          }
        return suma/calificaciones.length;
    }
    
}
