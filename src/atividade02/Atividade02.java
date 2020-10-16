/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

import Classes.*;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author izabe
 */
public class Atividade02 {
    
    public static void divisao(ArquivoSaida arqSaida,int[] vet, int[] valoresM){
            
        for(int i=0;i<valoresM.length;i++){
            TabelaHash thash = new Divisao(valoresM[i]);
            for (int j=0;j<vet.length;j++){
                thash.insere(vet[j]);
            }
            if (i==0){
                Saida nsaida = new Saida("Divisão","Primo",valoresM[i],thash.getColisoes());
                arqSaida.addSaida(nsaida);
            } else if (i==1){
                Saida nsaida = new Saida("Divisão","Não Primo",valoresM[i],thash.getColisoes());
                arqSaida.addSaida(nsaida);
            } else if (i==2){
                Saida nsaida = new Saida("Divisão","Potência de 2",valoresM[i],thash.getColisoes());
                arqSaida.addSaida(nsaida);
            } else {
                Saida nsaida = new Saida("Divisão","Primo próximo de potencia de 2",valoresM[i],thash.getColisoes());
                arqSaida.addSaida(nsaida);
            }
        }
        
    }
    
        
    public static void multiplicacao(ArquivoSaida arqSaida,int[] vet, int[] valoresM){
            
            for(int i=0;i<valoresM.length;i++){
            TabelaHash thash = new Multiplicacao(valoresM[i]);
            for (int j=0;j<vet.length;j++){
                thash.insere(vet[j]);
            }
            if (i==0){
                Saida nsaida = new Saida("Multiplicação","Primo",valoresM[i],thash.getColisoes());
                arqSaida.addSaida(nsaida);
            } else if (i==1){
                Saida nsaida = new Saida("Multiplicação","Não Primo",valoresM[i],thash.getColisoes());
                arqSaida.addSaida(nsaida);
            } else if (i==2){
                Saida nsaida = new Saida("Multiplicação","Potência de 2",valoresM[i],thash.getColisoes());
                arqSaida.addSaida(nsaida);
            } else {
                Saida nsaida = new Saida("DMultiplicação","Primo próximo de potencia de 2",valoresM[i],thash.getColisoes());
                arqSaida.addSaida(nsaida);
            }
        }
        
    }
    
    public static void minhaMultiplicacao(ArquivoSaida arqSaida,int[] vet,int[] valoresM){
            
            for(int i=0;i<valoresM.length;i++){
            TabelaHash thash = new MinhaMultiplicacao(valoresM[i]);
            for (int j=0;j<vet.length;j++){
                thash.insere(vet[j]);
            }
            if (i==0){
                Saida nsaida = new Saida("Minha Multiplicação","Primo",valoresM[i],thash.getColisoes());
                arqSaida.addSaida(nsaida);
            } else if (i==1){
                Saida nsaida = new Saida("Minha Multiplicação","Não Primo",valoresM[i],thash.getColisoes());
                arqSaida.addSaida(nsaida);
            } else if (i==2){
                Saida nsaida = new Saida("Minha Multiplicação","Potência de 2",valoresM[i],thash.getColisoes());
                arqSaida.addSaida(nsaida);
            } else {
                Saida nsaida = new Saida("Minha Multiplicação","Primo próximo de potencia de 2",valoresM[i],thash.getColisoes());
                arqSaida.addSaida(nsaida);
            }

        
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] valoresdeM = {113,105,128,127};
        
        int[] vet = new int[100];
        
        for (int i=0;i<100;i++){
            vet[i] = ThreadLocalRandom.current().nextInt(1000);
            System.out.print(vet[i]+"\t");
        }
        System.out.println();
        
        ArquivoSaida arqSaida = new ArquivoSaida();
        
        divisao(arqSaida,vet,valoresdeM);
        multiplicacao(arqSaida,vet,valoresdeM);
        minhaMultiplicacao(arqSaida,vet,valoresdeM);       
        
        arqSaida.gravaSaidas();
    }
    
}
