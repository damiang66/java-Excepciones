
package guiapooejercicio7;

import guiapooejercicio7.entidades.Persona;
import guiapooejercicio7.servicio.Servicio;
//import java.util.ArrayList;
//import java.util.List;

public class GuiaPooEjercicio7 {

    
    public static void main(String[] args) {
        Servicio service = new Servicio();
        Persona p = null;
        
        try {
             service.esMayorDeEdad(p);
        } catch (NullPointerException e) {
            System.out.println("la clase persona esta inicializada en null");
        }
       
       /*
        List<Persona> lista = new ArrayList();
       Servicio serv = new Servicio();
       
       Persona p= new Persona("damian", 0, Sexo.OTRO, 0, 0);
       Persona p1= new Persona("camila", 0, Sexo.OTRO, 0, 0);
       Persona p2= new Persona("clarisa", 0, Sexo.OTRO, 0, 0);
       Persona p3= new Persona("jose", 0, Sexo.OTRO, 0, 0);
       lista.add(p);
       lista.add(p1);
       lista.add(p2);
       lista.add(p3);
        System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre());
        }
        int []vector = new int[]{1,2};
       
        for (int aux : vector) {
            System.out.println(aux);
            
        }
       */
       
       
       
    }
    
}
