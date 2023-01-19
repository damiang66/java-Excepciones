package cargasconsulta.ejercicio3;

import cargasconsulta.ejercicio3.entity.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
una división con los dos numeros y mostrar el resultado.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer numero");
        String letra1 = leer.next();
        System.out.println("Ingrese el segundo numero");
        String letra2 = leer.next();
        DivisionNumero d = new DivisionNumero();
        try {
            int num1 = Integer.parseInt(letra1);
            int num2 = Integer.parseInt(letra2);

            d.setNum1(num1);
            d.setNum2(num2);
            int div = num1 / num2;
            System.out.println(div);
        } catch (InputMismatchException e) {
            //System.out.println(e.getMessage());
            System.out.println("Error de tipo InputMismatchException ");
        } catch (NumberFormatException e) {
            System.out.println("Una cadena no puede convertirse a entero ");
        } catch (ArithmeticException e) {
            System.out.println("no se puede dividir por 0");
        }

    }
}
