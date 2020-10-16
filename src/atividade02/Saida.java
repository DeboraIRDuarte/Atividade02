/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

/**
 *
 * @author izabe
 */
public class Saida {
    
    private String metodo;
    private String tipodeM;
    private String valordeM;
    private String colisoes;
   

    
    /**
     * Construtor vazio da classe Saida
     */
    public Saida(){
        
    }
    
    
    public Saida (String metodo, String tipodeM, int valordeM, int colisoes){
        
        this.metodo = metodo;
        this.tipodeM = tipodeM;
        this.valordeM = Integer.toString(valordeM);
        this.colisoes = Integer.toString(colisoes);      
        
    }

    /**
     * @return the metodo
     */
    public String getMetodo() {
        return metodo;
    }

    /**
     * @return the tipodeM
     */
    public String getTipodeM() {
        return tipodeM;
    }

    /**
     * @return the valordeM
     */
    public String getValordeM() {
        return valordeM;
    }

    /**
     * @return the colisoes
     */
    public String getColisoes() {
        return colisoes;
    }

    
    
    

}
