package punto6;

import java.util.Scanner;

// 6. Elaborar un programa que le permita a un usuario ingresar
// el nombre de un trabajador, el número de horas trabajadas
// y valor hora, se pide que el programa le imprima el salario
// bruto, las bonificaciones, las deducciones y el salario neto;

// teniendo en cuenta que las bonificaciones serán de
// $20.000 si trabajó como máximo 48 horas, de $50.000 si
// trabajo entre 49 y 58 horas y de $100.000 si trabajó más de
// 58 horas. 

//Las deducciones son de $10.000 si el salario
// básico hora es menor de $5.000, de $20.000 si el salario
// básico hora es mayor de $5.000 y menor de $8.000 y de $
// 50.000 si su salario básico hora es de $8.000 o más.


class App{

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter employee name");
        String name = input.nextLine();

        System.out.println("Enter the number of hours worked");
        Double hours = input.nextDouble();

        System.out.println("Enter the wage per hour");
        Double wage = input.nextDouble();


        Double bonificaciones=0.0;
        Double deducciones = 0.0;
        Double grossSalary =(hours*wage);

        System.out.println("Hello"+name+"your gross salary is"+grossSalary);
        System.out.println("Your bonifications are"+bonificaciones);
        System.out.println("Your deductions are"+deducciones);
        System.out.println("Hello"+name+"your net salary is"+((hours*wage)+(bonificaciones-deducciones)));
     
       
        // Variable bonificaciones

        if(hours<=48.0){

            bonificaciones = 20000.0;

        }else if(hours >= 49.00 && hours<=58.88){

            bonificaciones=50000.0;

        }else if(hours>=100.00){

            bonificaciones=100000.0;

        }else{
            System.out.println("You don't have any bonification");

        }


        // Variable deducciones

        if(wage<5000.0){

           deducciones=10000.0;

        }else if(wage>= 5000.0 && wage <=8000.0){

            deducciones=20000.0;

        }else if(wage > 8000.0){
            
            deducciones=50000.0;

        }else{
            System.out.println("Your deductions is Zero");


        }

           
          

        

    }

}
    
  

        
        
    



