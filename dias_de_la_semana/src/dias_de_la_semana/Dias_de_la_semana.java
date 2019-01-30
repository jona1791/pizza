/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dias_de_la_semana;
import java.util.*;
/**
 *
 * @author Usuario DAM 1
 */
public class Dias_de_la_semana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
        String dia;
        dia = sc.nextLine();

        int Numerodedia = 0;

        switch (dia) {
            case "lunes":
                Numerodedia = 0;
                break;
            case "martes":
                Numerodedia = 1;
                break;
            case "miércoles":
                Numerodedia = 2;
                break;
            case "jueves":
                Numerodedia = 3;
                break;
            case "viernes":
                Numerodedia = 4;
                break;
            default:
                System.out.print("El día introducido no es correcto.");
        }

        System.out.println("A continuación introduzca la hora (hora y minutos)");
        
        int horas;
        System.out.print("Hora: ");
        horas = sc.nextInt();
        
        int minutos;
        System.out.print("Minutos: ");
        minutos = sc.nextInt();

        int minutosTotales = (4 * 24 * 60) + (15 * 60);
        int minutosActuales = (Numerodedia * 24 * 60) + (horas * 60) + minutos;

        System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
    }
}
