package com.mycompany.ejercicioconunarreglo.controlador;

import com.mycompany.ejercicioconunarreglo.modelo.Arreglo;

public class ArregloControlador implements InterfaceArreglo{
    
    Arreglo arreglo = new Arreglo();
    
    @Override
    public int ObtenerNumeroMayor(int[] numero) {
        return arreglo.ObtenerNumeroMayor(numero);
    }

    @Override
    public int ObtenerNumeroMenor(int[] numero) {
        return arreglo.ObtenerNumeroMenor(numero);
    }

    @Override
    public double ObtenerPromedio(int[] numero) {
        return arreglo.ObtenerPromedio(numero);
    }
    
}
