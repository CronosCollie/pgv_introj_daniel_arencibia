/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_ut03;

/**
 *
 * @author Daniel
 */
public class Dinero {
    private int euros;
    private final int diez = 10; final int cinco = 5; final int dos = 2; final int uno = 1;
    
    public Dinero(int euros){ //constructor
        if(euros<0 && euros>100) euros = 0;
        else this.euros = euros;
    }
    
    public void setEuros(int euros){ //setter, mutador
        this.euros = euros;
    }
    
    public int getEuros(){ //getter, accesor
        return euros;
    }
    
    public void printDescomposicionMonedas(/*32*/){
        int[] descomp={diez, cinco, dos, uno};
        int cantidad = euros;
        int cantidadParcial=0; 
        int i=0;
        
        while(i<descomp.length){
            cantidadParcial = cantidad/descomp[i];
            if(cantidadParcial!=0){
                System.out.println("Billetes " + descomp[i] + ": " + cantidadParcial);
            }
            cantidad%=descomp[i];
            i++;
            
        }
    }
}
