/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracciones1;

/**
 *
 * @author Usuario DAM 1
 */
public class Fracciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        fraccion numerador = new fraccion();
        numerador.setNumerador(0);
        numerador.setDenominador(0);
        fraccion invierte = new fraccion();
        fraccion multiplica = new fraccion();
        fraccion divide = new fraccion();

        System.out.println("Divide: " + fraccion.divide(6, 3));
        System.out.println("Invierte: " + fraccion.invierte(6, 3));
        System.out.println("Multiplica: " + fraccion.multiplica(6, 3));
    }

}


