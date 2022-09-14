/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_ut03;

/**
 *
 * @author Daniel
 */
public class Hora {
    private int hora, minuto, segundos;
    
    public Hora(){
        hora = 0;
        minuto = 0;
        segundos = 0;
    }
    
    //mutadores o setters
    public void marcarHora(int hora){
        this.hora = hora;
    }
    
    public void marcarMinuto(int minuto){
        this.minuto = minuto;
    }
    
    public void marcarSegundos(int segundos){
        this.segundos = segundos;
    }
    
    //accesores o mutadores
    public int dimeHora(){
        return hora;
    }
    
    public int dimeMinuto(){
        return minuto;
    }
    
    public int dimeSegundos(){
        return segundos;
    }
    
    public void avanzarSegundo(){
        segundos++;
    }
    
    @Override
    public String toString(){
        String horaCompleta = String.format("%02d:%02d:%02d",hora,minuto,segundos);
        return horaCompleta;
    }
}
