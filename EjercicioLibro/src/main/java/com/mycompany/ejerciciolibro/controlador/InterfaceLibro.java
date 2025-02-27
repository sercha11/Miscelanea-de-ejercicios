package com.mycompany.ejerciciolibro.controlador;

import com.mycompany.ejerciciolibro.modelo.Libro;

public interface InterfaceLibro {
  public double ObtenerDescuento(Libro libro);
  public double ObtenerLibroConDescuento(Libro libro);
}
