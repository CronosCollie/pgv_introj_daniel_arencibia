/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_ut03;

/**
 *
 * @author Daniel
 */
public class Fecha {
    private int dia, mes, anio;
    
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public boolean esBisiesto(){
        while(anio%4==0 && anio%100!=0){
            return true;
        }
        return false;
    }
    
    public int diasMes(){
        switch(mes){
            case 1:
                return 31;
            case 2:
                if(!esBisiesto()){
                    return 28;
                } else {
                    return 29;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
    }
    
    public String printCorta(){
        String fechaCorta = String.format("%02d-%02d-%04d", dia, mes, anio);
        return fechaCorta;
    }
    
    public String printLarga(){
        switch(mes){
            case 1:
                return dia + " de Enero de" + anio;
            case 2:
                return dia + " de Febrero de " + anio;
            case 3:
                return dia + " de Marzo de " + anio;
            case 4:
                return dia + " de Abril de " + anio;
            case 5:
                return dia + " de Mayo de " + anio;
            case 6:
                return dia + " de Junio de " + anio;
            case 7:
                return dia + " de Julio de " + anio;
            case 8:
                return dia + " de Agosto de " + anio;
            case 9:
                return dia + " de Septiembre de " + anio;
            case 10:
                return dia + " de Octubre de " + anio;
            case 11:
                return dia + " de Noviembre de " + anio;
            case 12:
                return dia + " de Diciembre de " + anio;
            default: return "Error";
        } 
    }
    
    public boolean esCorrecta(){
        if(dia>1&&dia<=diasMes() && mes>1&&mes<13) return true;
        return false;
    }
}
