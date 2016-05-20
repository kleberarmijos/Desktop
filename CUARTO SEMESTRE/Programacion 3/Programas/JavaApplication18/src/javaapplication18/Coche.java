/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author kleber
 */
public class Coche {

    public Coche(String Nombre, int Num_llanta, String color) {
        this.Nombre = Nombre;
        this.Num_llanta = Num_llanta;
        this.color = color;
    }
    
    String Nombre ;
    int Num_llanta;
    String color;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNum_llanta() {
        return Num_llanta;
    }

    public void setNum_llanta(int Num_llanta) {
        this.Num_llanta = Num_llanta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
