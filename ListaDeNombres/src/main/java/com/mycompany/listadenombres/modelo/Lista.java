package com.mycompany.listadenombres.modelo;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<String> nombre = new ArrayList<>();

    @Override
    public String toString() {
        return "Lista{" + "nombre=" + nombre + '}';
    }

    public List<String> getNombre() {
        return nombre;
    }

    public void setNombre(List<String> nombre) {
        this.nombre = nombre;
    }

    public Lista() {
    }
    
    public boolean agregarNombre(String nombres){
        
        return nombre.add(nombres);
    }
    
    public boolean eliminarNombre(String nombres){
       return nombre.remove(nombres);
}


    public boolean BuscarNombre(String nombres){
            if (nombres == null || !nombres.matches("[a-zA-Z]+")) {
            return false;
        }
        return nombre.contains(nombres);
    } 
    
}
