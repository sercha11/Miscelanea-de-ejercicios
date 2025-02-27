package com.mycompany.ejerciciolibro.controlador;

import com.mycompany.ejerciciolibro.modelo.Libro;

public class LibroControlador implements InterfaceLibro{
  
    @Override
    public double ObtenerDescuento(Libro libro) {
        return libro.ObtenerDescuento(libro);
    }

    @Override
    public double ObtenerLibroConDescuento(Libro libro) {
        return libro.ObtenerLibroConDescuento(libro);
        
                }

    
}
