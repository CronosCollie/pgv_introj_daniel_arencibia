/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_ut03;

/**
 *
 * @author Daniel
 */
public class Ordenador {
    private int maxMemoria;
    private int memoriaInstalada;
    
    private int memoriaDisponible;
    
    public Ordenador(int maxMemoria){
        if(maxMemoria<0)    maxMemoria = 1024;
        this.maxMemoria = maxMemoria;
        memoriaInstalada = 0;
    }
    
    //getters o accesores
    public int getMaxMemoria(){
        return maxMemoria;
    }
    
    public int getMemoriaDisponible(){
        return memoriaDisponible = maxMemoria - memoriaInstalada;
    }
    
    
    //setters o mutadores
    public void vaciarMemoria(){
        memoriaInstalada = 0;
    }
    
    /*
    public boolean instalar256Mb(){
        memoriaInstalada = 256;
    }
    */
    
    public boolean instalar256Mb(){
        if(getMemoriaDisponible()<256)  return false;
        else {
            memoriaInstalada = 256;
            return true;
        }
    }
    
    /*
    public void instalarMemoria(int memoria){
        memoriaInstalada = memoria;
    }
    */
    public boolean instalarMemoria(int memoria){
        if(memoria>getMemoriaDisponible())  return false;
        else {
            memoriaInstalada = memoria;
            return true;
        }
    }
    
    //toString
    public String printInformacion(){
        return "Este ordenador puede tener hasta " + getMaxMemoria() + " Mb de memoria."
                + "\nTodavía es posible instalar " + getMemoriaDisponible() + " Mb.";
    }
}
