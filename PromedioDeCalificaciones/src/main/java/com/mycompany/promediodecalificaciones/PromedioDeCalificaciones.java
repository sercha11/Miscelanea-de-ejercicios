package com.mycompany.promediodecalificaciones;

import com.mycompany.promediodecalificaciones.modelo.Estudiante;

public class PromedioDeCalificaciones {

    public static void main(String[] args) {
    
        try{
            Estudiante [] estudiantes = new Estudiante[3];
            estudiantes[0] = new Estudiante();
            estudiantes[0].setNombre("Sara");
            estudiantes[0].setEdad(12);
            estudiantes[0].setCalificaciones(new int[] {61, 70, 84, 90, 79});
           
            estudiantes[1] = new Estudiante();
            estudiantes[1].setNombre("Marta");
            estudiantes[1].setEdad(16);
            estudiantes[1].setCalificaciones(new int[] {90, 95, 100, 90, 93});
        
            estudiantes[2] = new Estudiante();
            estudiantes[2].setNombre("Lisandro");
            estudiantes[2].setEdad(28);
            estudiantes[2].setCalificaciones(new int[] {56, 61, 70, 68, 69});
           
            for(Estudiante e: estudiantes){
                double promedio = e.calcularPromedio(e.getCalificaciones());
                
                System.out.println("Nombre: "+e.getNombre()+ " Promedio: "+promedio); 
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error inesperado");
        
        }
    }
}
