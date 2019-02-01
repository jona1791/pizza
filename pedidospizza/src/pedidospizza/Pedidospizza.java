/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidospizza;

/**
 *
 * @author Usuario DAM 1
 */
public class Pedidospizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pizza p1 = new pizza ("margarita", "mediana");
        pizza p2 = new pizza ("funghi", "familiar");
        p2.sirve();
        pizza p3 = new pizza ("cuatro quesos", "mediana");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("pedidas: " + pizza.getTotalPedidas());
        System.out.println("servidas: " + pizza.getTotalServidas());
    }
    
}
