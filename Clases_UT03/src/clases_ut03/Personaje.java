/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_ut03;

/**
 *
 * @author Daniel
 */
public class Personaje {
    private char NORTE;
    private char SUR;
    private char ESTE;
    private char OESTE;
    private String nombre;
    private int x;
    private int y;
    private char orientacion;
    
    public Personaje(String nombre){
        NORTE = 'N'; SUR = 'S'; ESTE = 'E'; OESTE = 'O';
        this.nombre = nombre.toUpperCase();
        x = 0;  y = 0;  orientacion = 'N';
    }
    
    @Override
    public String toString(){
        return "Personaje = " + nombre
                + "\nOrientacion = " + orientacion
                + "\nPosicion = " + posic();
    }
    
    public String posic(){
        return "[ " + x + ", " + y + " ]";
    }
    
    public void avanzar(int casillas){
        if(orientacion=='N' || orientacion=='S') x += casillas;
        else if(orientacion=='E' || orientacion=='O') y += casillas;
    }
    
    public void girar(){
        if(orientacion=='N') orientacion = 'S';
        else if(orientacion=='S') orientacion = 'O';
        else if(orientacion=='O') orientacion = 'E';
        else if(orientacion=='E') orientacion = 'N';
    }
}
