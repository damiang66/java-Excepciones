

package cargasconsulta.ejercicio2;

import cargasconsulta.ejercicio2.entity.ClaseList;
import java.util.ArrayList;
import java.util.List;


public class Ejercicio2 {

    public static void main(String[] args) {
     ClaseList lista= new ClaseList();
     List<String>algo= new ArrayList();
     algo.add("a");
     algo.add("b");
     lista.setAlgo(algo);
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(lista.getAlgo().get(i));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Se salio de rango la lista");
                break;
            }
            
        }
    }
}
