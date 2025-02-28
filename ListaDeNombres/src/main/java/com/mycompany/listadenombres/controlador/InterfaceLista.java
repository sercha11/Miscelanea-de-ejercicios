package com.mycompany.listadenombres.controlador;

import javax.swing.JTextArea;

public interface InterfaceLista {
    public void agregarNombre(String nombres);
    public void eliminarNombre(String nombres);
    public void mostrarNombre(JTextArea textArea);
    public void buscarNombre(String nombres);
    
    
}
