package cargasconsulta.ejercicio5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    /*
    Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora 
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para 
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el 
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando 
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario 
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe 
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el 
carácter fallido como un intento
     */
    public static void main(String[] args) throws MiExp {
        Random aleatorio = new Random();
        Integer adivinar = 0;
        Integer c = 0;
        Integer num = 0;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int a = 0;
        do {
            adivinar = aleatorio.nextInt(500);
        } while (adivinar == 0);

        System.out.println(adivinar);
        do {
            a = adivinar;
            System.out.println("Ingrese un numero entre 1 y 500 para adivinar");
            num = ControlarExcep(num);
            if (a < num) {
                System.out.println("El número a encontrar es menor al número ingresado");
            } else {
                System.out.println("El número a encontrar es mayor al número ingresado");
            }

            c++;

        } while (num != a);
        System.out.println("Usted realizo la prueba en " + c + " intentos");
    }

    public static int ControlarExcep(int n) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            n = leer.nextInt();
            return n;
        } catch (Exception e) {
            System.out.println("Ingreso culquiera");
            return 0;
        }
    }
}
