package punto4;

import java.util.Scanner;

// Se necesita un programa que diga si una persona es apta
// para un equipo de baloncesto o no, para que sea apto
// debe cumplir que si es hombre sea mayor de edad, que
// mida más de 1.70 mts., que pese menos de 75 kg., o si es
// mujer que tenga más de 16 años, que mida como mínimo
// 1.70 y que pese como máximo 60 kg. Se debe leer el
// nombre, el sexo (F = femenino, M = masculino), la edad, la
// estatura y el peso.


public class App {

     static Scanner leer = new Scanner(System.in);

     public static void main(String[] args) {

        String masculino = "MASCULINO";
        String femenino = "FEMENINO";


        System.out.println("Ingrese su genero"); 
        String genero = leer.next().toUpperCase();

        System.out.println("Ingrese su edad"); 
        Integer edad = leer.nextInt();

        System.out.println("Ingrese su estatura"); 
        int estatura = leer.nextInt();

        System.out.println("Ingrese su peso"); 
        Double peso = leer.nextDouble();


        if((genero.equals(masculino) && edad>18 && peso < 75 && estatura>1.75)||((genero.equals(femenino) && edad>16 && peso >= 60 && estatura>=1.70))){

            System.out.println("Es apto para jugar baloncesto");
        }else{
            System.out.println("No es apto para jugar baloncesto");

        }
        
     }

}


    
