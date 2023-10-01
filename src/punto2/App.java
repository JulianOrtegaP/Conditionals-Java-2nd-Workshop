package punto2;

import java.util.Scanner;

// Crear un algoritmo que le permita al usuario ingresar 3
// números diferentes entre sí y el computador se los muestre
// en orden ascendente

public class App {

static Scanner leer = new Scanner(System.in);

public static void main(String[] args) {
    
    System.out.println("Ingrese un numero");
    Double numero1 = leer.nextDouble();

    System.out.println("Ingrese un numero");
    Double numero2 = leer.nextDouble();

    System.out.println("Ingrese un numero");
    Double numero3 = leer.nextDouble();

if(numero1.equals(numero3)||numero1.equals(numero2)||numero2.equals(numero3)){
    System.out.println("Los numeros deben ser diferentes");
    }else if((numero1>numero2 && numero1>numero3)||
             (numero2>numero1 && numero2>numero3)||
             (numero3>numero2 && numero3>numero1)){

 

}




}

    
}
