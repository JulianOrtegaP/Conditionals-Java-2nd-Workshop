package punto1;

import java.util.Scanner;

// Crear un algoritmo que le permita al usuario ingresar el
// nombre de un estudiante y las 4 notas que obtuvo en una
// materia y el computador le imprima el nombre, la nota
// definitiva y un mensaje que le indique si “GANA” O
// “PIERDE”. (LAS NOTAS SON DE 0 A 5.0, GANA SI LA
// NOTA ES MAYOR O IGUAL A 3.0 Y PIERDE SI ES
// MENOR A 3.0)

public class App {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Ingrese el nombre del estudiante");
        String estudiante = leer.next();

        System.out.println("Ingrese la 1ra nota del estudiante");
        Double nota1 = leer.nextDouble();

        System.out.println("Ingrese la 2da nota del estudiante");
        Double nota2 = leer.nextDouble();

        System.out.println("Ingrese la 3ra nota del estudiante");
        Double nota3 = leer.nextDouble();

        System.out.println("Ingrese la 4ra nota del estudiante");
        Double nota4 = leer.nextDouble();

        if(((nota1+nota2+nota3+nota4)/4)>=3.0){
            System.out.println("el estudiante"+estudiante+"GANA");
        } else{
            System.out.println("El estudiante"+estudiante+"PIERDE");
        }


    }
    
}
