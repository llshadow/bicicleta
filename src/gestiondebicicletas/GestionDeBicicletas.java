
package gestiondebicicletas;

import java.util.Scanner;

/**
 *
 * @author ID2515
 */
public class GestionDeBicicletas {


    public static void main(String[] args) {
        
       Bicicleteria nuevaBicicleteria = new Bicicleteria();
       Scanner teclado=new Scanner(System.in);
       String numeroSerie;
       String modelo;
       System.out.println("Ingrese numero de serie:");
       numeroSerie=teclado.nextLine();
       System.out.println("Ingrese modelo");
       modelo = teclado.nextLine(); 
        
    }
    
}
