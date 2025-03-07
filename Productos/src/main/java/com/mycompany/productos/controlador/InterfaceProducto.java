package com.mycompany.productos.controlador;

import com.mycompany.productos.modelo.Producto;
import javax.swing.JTextArea;

public interface InterfaceProducto {
    public void agregarProductos(Producto producto);
    public void mostrarProductos(JTextArea textArea);
    public double calcularInventario();
}
