/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;
import java.util.*;
/**
 *
 * @author Usuario DAM 1
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1;
        System.out.println("Introduce la nota del primer examen.");
        nota1 = sc.nextDouble();
        
        double notaFinal;
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        notaFinal = sc.nextDouble();
        
        double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
        
        System.out.println("Para tener un " + notaFinal + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");
    
        
    }
    
}
