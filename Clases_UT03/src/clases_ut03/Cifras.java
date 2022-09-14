/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_ut03;

/**
 *
 * @author Daniel
 */
public class Cifras {
    private int numero;
    
    public Cifras(){
        numero = 999;
    }
    
    public void setNumero(int n){
        if(n>99 && n<=999) numero = n;
        else numero = 999;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public boolean esPar(){
        if(numero%2==0) return true;
        return false;
    }
    
    public void getUltimaCifra(){
        int ultNum = numero%10;
        System.out.println(ultNum);
    }
    
    public int obtenerSumaCifras(){
        int n1 = numero%10;
        int n2 = (numero/10)%10;
        int n3 = (numero/100);
        
        int result = n1+n2+n3;
        return result;
    }
    
    
}
