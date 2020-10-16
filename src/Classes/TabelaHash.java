/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import ListaNo.Lista;


/**
 *
 * @author izabe
 */
public abstract class TabelaHash {
    
    int m;
    Lista[] thash;
    
    abstract int funcao(int chave);
    
    public TabelaHash(int m){
        this.m = m;
        this.thash = new Lista[m];
        for (int i=0;i<m;i++){
            thash[i] = new Lista();
        }
    }
    
    public void insere (int chave){
        int posicao = funcao(chave);
        thash[posicao].insereNaLista(chave);
    }
    
    public int busca(int chave){
        int posicao = funcao(chave);
        return thash[posicao].buscaNaLista(chave);
    }
    
    public int getColisoes(){
        int contaColisoes = 0;
        for (int i=0; i<thash.length;i++){
           if(thash[i].getTamanho()>0){
           contaColisoes = contaColisoes + (thash[i].getTamanho()-1);
           }
        }
        return contaColisoes;
    }
    
    public void remove(int chave){
        int posicao = funcao(chave);
        thash[posicao].remove(chave);
    }
    
    
}
