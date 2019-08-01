package gestiondebicicletas;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ID2515
 */
public class Bicicleteria {
    
      private float ganancia;
      private int cantidadDeVentas;
      private List<bicicleta>Bicicletas = new ArrayList<>();
      
      
      public Bicicleteria(){
        Bicicletas=new ArrayList<>();
      }
      
      
      void adBicicleta (bicicleta nuevaBici){
        Bicicletas.add(nuevaBici);
      }
      
      void venderBicicleta (bicicleta bicicleta){
         Bicicletas.remove(bicicleta);
         cantidadDeVentas++;
         ganancia=ganancia+bicicleta.getPrecio();      
      }
      
      
      
      
}
