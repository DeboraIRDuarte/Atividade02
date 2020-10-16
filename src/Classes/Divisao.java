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
public class Divisao extends TabelaHash{

    public Divisao(int m) {
        super(m);
    }

    @Override
    int funcao(int chave) {        
        
        return chave%this.m;
    }
    
}
