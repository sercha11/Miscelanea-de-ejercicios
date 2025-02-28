package com.mycompany.listadenombres.controlador;

import com.mycompany.listadenombres.modelo.Lista;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ListaControlador implements InterfaceLista{
    Lista lista = new Lista();
    
    @Override
    public void agregarNombre(String nombres) {
      nombres = JOptionPane.showInputDialog(null, "Ingrese el nombre que desea agregar");
      if(nombres == null || !nombres.matches("[a-zA-Z]+")){
          JOptionPane.showMessageDialog(null, "Debe ingresar un nombre válido");
      } else if( lista.agregarNombre(nombres)) {
          JOptionPane.showMessageDialog(null, "Nombre ingresado");
      } else {
           JOptionPane.showMessageDialog(null, "No se pudo ingresar el nombre");
      }
    }

    @Override
    public void eliminarNombre(String nombres) {
      nombres = JOptionPane.showInputDialog(null, "Ingrese el nombre que desea eliminar");
      if(nombres ==null || !nombres.matches("[a-zA-Z]+")){
          JOptionPane.showMessageDialog(null, "Debe ingresar un nombre válido");
      } else if( lista.eliminarNombre(nombres)) {
          JOptionPane.showMessageDialog(null, "Nombre eliminado");
      } else {
          JOptionPane.showMessageDialog(null, "No existe el nombre");
      }
    }

    @Override
    public void mostrarNombre(JTextArea textArea) {
        textArea.setText("");
        List<String> nombres = lista.getNombre();
        for(String n: nombres) {
            textArea.append(n + "\n");
        }
    
    }

    @Override
    public void buscarNombre(String nombres) {
      nombres = JOptionPane.showInputDialog(null, "Ingrese el nombre que desea buscar");
      if(nombres == null || !nombres.matches("[a-zA-Z]+")){
          JOptionPane.showMessageDialog(null, "Debe ingresar un nombre válido");
      } else {
          boolean encontrado = lista.BuscarNombre(nombres);
          if(encontrado) {
             JOptionPane.showMessageDialog(null, "Nombre fue encontrado con exito");
          } else {
              JOptionPane.showMessageDialog(null, "Nombre no encontrado");
          }
          
      }
    }
    
}
