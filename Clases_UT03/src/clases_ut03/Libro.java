/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_ut03;

/**
 *
 * @author Daniel
 */
public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    
    private String numeroReferencia;
    private int vecesPrestado;
    
    public Libro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;

        numeroReferencia = "";
        vecesPrestado = 0;
    }
    
    public void setTitulo(String titulo){ //setter
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    
    public String getTitulo(){ //getter
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getPaginas(){
        return paginas;
    }
    
    public String printDetalles(){
        return "Título: " + titulo
                + "\nAutor: " + autor
                + "\nNúmero páginas: " + paginas + "\n";
    }
    
    public void setNumeroReferencia(String referencia){
        numeroReferencia = referencia;
    }
    
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    

    public String printDetallesMas(){
        return "Título: " + titulo
                + "\nAutor: " + autor
                + "\nNúmero páginas: " + paginas
                + "\nNúmero de referencia: " + numeroReferencia + "\n";
    }
    
    public void prestar(){
        vecesPrestado++;
    }
    
    public int getPrestar(){
        return vecesPrestado;
    }
    
    
    public String printDetallesMasP(){
        return "Título: " + titulo
                + "\nAutor: " + autor
                + "\nNúmero páginas: " + paginas
                + "\nNúmero de referencia: " + numeroReferencia 
                + "\nVeces prestado: " + getPrestar() + "\n";
    }
}
