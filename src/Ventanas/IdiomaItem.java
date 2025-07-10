/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

import javax.swing.*;


public class IdiomaItem {
    private String nombre;
    private ImageIcon icono;

    public IdiomaItem(String nombre, ImageIcon icono) {
        this.nombre = nombre;
        this.icono = icono;
    }

    public String getNombre() {
        return nombre;
    }

    public ImageIcon getIcono() {
        return icono;
    }

    @Override
    public String toString() {
     return nombre;
    }
}
