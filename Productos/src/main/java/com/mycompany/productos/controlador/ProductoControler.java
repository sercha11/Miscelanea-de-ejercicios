package com.mycompany.productos.controlador;

import com.mycompany.productos.modelo.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;

public class ProductoControler implements InterfaceProducto {
    
    private List<Producto> lista = new ArrayList<>();
            
    @Override
    public void agregarProductos(Producto productos) {
        lista.add(productos);
    }

    @Override
    public void mostrarProductos(JTextArea textArea) {
        textArea.setText("");
        for(Producto p: lista) {
        textArea.append(p + "\n");
        
        }
    }
    
    @Override
    public double calcularInventario() {
        double total = 0;
        for(Producto p: lista) {
            total = total + p.getPrecio()* p.getCantidad();
        }
        return total;
    }
    
}
