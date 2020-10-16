/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaNo;

/**
 *
 * @author izabe
 */
public class Lista {
    
    private int tamanho;
    No inicio;
    
    public Lista(){
        tamanho=0;
    }
    
    public void insereNaLista(int info){
        No no = new No();
        no.info = info;
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }
    
    public int buscaNaLista(int info){
        No no = inicio;
        while (no!=null){
            if (no.info==info){
                return info;
            }
        }
        return -1;
    }
    
    public void remove(int info){
        No no = inicio;
        while (no!=null){
            if (no.info==info){
                no.info = 0;
            }
        }
    }

    /**
     * @return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }


    
        
}
