/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapooejercicio7.servicio;

import guiapooejercicio7.Sexo;
import guiapooejercicio7.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   public Persona crearPersona(){
        Persona p = new Persona();
        System.out.println("ingrese nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese edad");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese sexo\n"
                + "1-Hombre\n"
                + "2-Mujer\n"
                + "3-Otro");
        int opcion=leer.nextInt();
        switch(opcion){
            case 1:
                p.setSexo(Sexo.HOMBRE);
            case 2:
                p.setSexo(Sexo.MUJER);
            default:
                p.setSexo(Sexo.OTRO);
                
        }
        System.out.println("Ingrese el peso");
        p.setAltura(leer.nextDouble());
        System.out.println("Ingrese altura");
        p.setAltura(leer.nextDouble());
        return p;
   }
   public int CalcularIMC(Persona p){
       double imc= p.getPeso()/(p.getAltura()*p.getAltura());
       if (imc<20){
           return -1;
       }else  if (imc>19 && imc<26){
           return 0;
       }else
           return 1;
      
       
        
   }
   public boolean esMayorDeEdad(Persona p){
       if(p.getEdad()>17){
           return true;
       }else{
           return false;
       }
   }
   
}
