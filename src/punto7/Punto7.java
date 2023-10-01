package punto7;

// Para la materia de Destrezas se determinó con los
// estudiantes que, si la nota del primer quiz era menor que la
// del segundo, se sustituía la primera nota por la segunda.
// La tercera y cuarta nota no se modifican. Elabore un
// algoritmo que le permita al profesor ingresar las 4 notas
// que obtuvo un alumno y el computador le muestre la nota
// definitiva y la calificación cualitativa que es: “E” si es mayor
// o igual a 4.5, “S” si es mayor o igual a 4.0 y menor de 4.5,
// “B” si es mayor o igual a 3.5 y menor de 4.0, “A” si es
// mayor o igual a 3.0 y menor de 3.5, “D” si es mayor o igual
// a 2.0 y menor de 3.0 “I” si es menor de 2.0.

// E
// S
// B
// A
// D
// I

import java.util.Scanner;

public class Punto7 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("Enter the first grade");
        Double grade1 = input.nextDouble();

        
        System.out.println("Enter the 2nd grade");
        Double grade2 = input.nextDouble();

        
        System.out.println("Enter the 3rd grade");
        Double grade3 = input.nextDouble();

        System.out.println("Enter the 4th grade");
        Double grade4 = input.nextDouble();


            if(grade1<grade2){


                   if(((grade2+grade2+grade3+grade4)/4)>=4.5){
                        System.out.println("Your grade is"+ ((grade2+grade2+grade3+grade4)/4)+"and your calification is E");
                    }else if(((grade2+grade2+grade3+grade4)/4)>=4.0 && ((grade1+grade2+grade3+grade4)/4)<4.5){
                        System.out.println("Your grade is"+((grade2+grade2+grade3+grade4)/4) +"and your calification is S");

                    }else if(((grade2+grade2+grade3+grade4)/4)>=3.5 && ((grade1+grade2+grade3+grade4)/4)<4.0){
                        System.out.println("Your grade is"+((grade2+grade2+grade3+grade4)/4)+"Your calification is B");

                    }else if(((grade2+grade2+grade3+grade4)/4)>=3.0 && ((grade1+grade2+grade3+grade4)/4)<3.5){
                        System.out.println("Your grade is A"+((grade2+grade2+grade3+grade4)/4));

                    }else if(((grade2+grade2+grade3+grade4)/4)>=2.0 && ((grade1+grade2+grade3+grade4)/4)<3.0){
                        System.out.println("Your grade is D"+((grade2+grade2+grade3+grade4)/4));

                    }else if(((grade2+grade2+grade3+grade4)/4)>=2.0){
                        System.out.println("Your grade is I"+((grade2+grade2+grade3+grade4)/4));

                    }else{
                        System.out.println("Error");
                    }
            
            }else if(((grade1+grade2+grade3+grade4)/4)>=4.5){
                    System.out.println("Your grade is"+((grade1+grade2+grade3+grade4)/4)+"And your calification is E");

            }else if (((grade1+grade2+grade3+grade4)/4)>=4.0 && ((grade1+grade2+grade3+grade4)/4)<4.5){
                    System.out.println("Your grade is S"+((grade1+grade2+grade3+grade4)/4));

            }else if (((grade1+grade2+grade3+grade4)/4)>=3.5 && ((grade1+grade2+grade3+grade4)/4)<4.0){
                    System.out.println("Your grade is B"+((grade1+grade2+grade3+grade4)/4));

            }else if (((grade1+grade2+grade3+grade4)/4)>=3.0 && ((grade1+grade2+grade3+grade4)/4)<3.5){
                    System.out.println("Your grade is A"+((grade1+grade2+grade3+grade4)/4));

            }else if (((grade1+grade2+grade3+grade4)/4)>=2.0 && ((grade1+grade2+grade3+grade4)/4)<3.0){
                    System.out.println("Your grade is D"+((grade1+grade2+grade3+grade4)/4));

            }else if(((grade1+grade2+grade3+grade4)/4)>=2.0){
                    System.out.println("Your grade is I"+((grade1+grade2+grade3+grade4)/4));
            }else{
                    System.out.println("Error");
            }     
        
    }

   } 
    

