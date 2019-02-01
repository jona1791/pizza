/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempo1;

/**
 *
 * @author Usuario DAM 1
 */
public class Tiempo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(1, 20, 30);
        Tiempo t2 = new Tiempo(0, 30, 40);
        Tiempo t3 = new Tiempo(0, 35, 20);

        System.out.println(t1);
        System.out.println(t2 + " - " + t3 + " = " + t2.suma(t3));
    }

}
