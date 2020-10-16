/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import ListaNo.Lista;
import static java.lang.Math.sqrt;

/**
 *
 * @author izabe
 */
public class MinhaMultiplicacao extends TabelaHash{

    public MinhaMultiplicacao(int m) {
        super(m);
    }

    @Override
    int funcao(int chave) {
        double a = (sqrt(3.0))/3; 
        double result = this.m*((chave*a)%1);        
        
        return (int)result;
    }
    
}
