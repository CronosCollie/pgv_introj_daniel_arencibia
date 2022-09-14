/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_ut03;

/**
 *
 * @author Daniel
 */
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    private int cantidadMinima;
    
    public Cafetera(){
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }
    
    //setters o mutadores
    public void establecerCapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public void establecerCantidadActual(int cantidadActual){
        this.cantidadActual = cantidadActual;
    }
    
    //getters o accesores
    public int mostrarCapacidadMaxima(){
        return capacidadMaxima;
    }
    
    public int mostrarCantidadActual(){
        return cantidadActual;
    }
    
    public void llenarCafetera(){
        cantidadActual = capacidadMaxima - cantidadActual;
    }
    
    public void servirTaza(int cantidad){
        if(cantidadActual<=cantidad){
            cantidadActual = 0;
        } else {
           cantidadActual -= cantidad; 
        } 
    }
    
    public void vaciarCafetera(){
        cantidadActual = 0;
    }
    
    public void agregarCafe(int cantidad){
        if(cantidadActual>=capacidadMaxima){
            System.out.println("La cafetera se encuentra llena o puede rebosar.");
        } else {
            cantidadActual += cantidad;
        }
        
    }
}
