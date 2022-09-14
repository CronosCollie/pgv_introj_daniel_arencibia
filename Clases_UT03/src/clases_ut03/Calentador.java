/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_ut03;

/**
 *
 * @author Daniel
 */
public class Calentador {
    private int temperatura;
    
    private int minimo;
    private int maximo;
    private int incremento;
    
    public Calentador(int minimo, int maximo){
        this.minimo = minimo;
        this.maximo = maximo;
        incremento = 5;
        
        temperatura = 15;
    }
    
    //mutador
    public void calentar(){
        if(temperatura>=maximo){
            System.out.println("Temperatura máxima alcanzada.");
        } else {
            temperatura += incremento;
        }   
    }
    
    public void enfriar(){
        if(temperatura<=minimo){
            System.out.println("Temperatura mínima alcanzada.");
        } else {
            temperatura -= incremento;
        }
    }
    
    //accesor
    public int temperatura(){
        return temperatura;
    }
    
    
    public void setIncremento(int incremento){
        if(incremento<0) System.out.println("El valor tiene que ser positivo.");
        this.incremento = incremento;
    }
    
}
