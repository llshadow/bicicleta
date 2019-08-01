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
    private List<bicicleta> Bicicletas = new ArrayList<>();

    public Bicicleteria() {
        Bicicletas = new ArrayList<>();
    }

    void adBicicleta(bicicleta nuevaBici) {
        Bicicletas.add(nuevaBici);
    }

    void venderBicicleta(bicicleta bicicleta) {
        Bicicletas.remove(bicicleta);
        cantidadDeVentas++;
        ganancia = ganancia + bicicleta.getPrecio();
    }

    public bicicleta BuscarBicicleta(String nroDeSerie) {
        for (int i = 0; i < Bicicletas.size(); i++) {
            if (Bicicletas.get(i).getNroDeSerie().equals(nroDeSerie)) {
                return Bicicletas.get(i);

            }
        }
        return null;

    }

    List<bicicleta> ordenarBicis() {
        bicicleta aux;
        boolean bandera = true;
        for (int j = 0; j < Bicicletas.size(); j++) {
            for (int i = 0; i < Bicicletas.size(); i++) {
                if (Bicicletas.get(i).getAño() < Bicicletas.get(i + 1).getAño()) {
                    aux = Bicicletas.get(i + 1);
                    Bicicletas.set(i + 1, Bicicletas.get(i));
                    Bicicletas.set(i, aux);

                }
            }
        }
        return Bicicletas;
    }
       
}
