package punto5;

import java.util.Scanner;

// Se tienen el área, el valor del metro cuadrado de una
// propiedad y la forma de pago de la cuota inicial. Se pide
// calcular el precio de venta de la propiedad y el valor de la
// cuota inicial, que sería el 20% del valor del precio de venta.
// Si la forma de pago es 1, se otorga un descuento del 10%
// sobre la cuota inicial y si la forma de pago es 2, se le
// recarga un 8% en el valor de la misma. Mostrar el valor del
// precio de venta y el de la cuota inicial de la propiedad (solo
// hay 2 formas de pago).

public class App {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        Double area = 80.0;
        Double valorMetro = 3000000.0;
        Double precioVenta = (area * valorMetro);
        Double cuotaInicial = ((precioVenta * 0.20));
        String pagoUno = "1";
        String pagoDos = "2";


        System.out.println("Ingrese su forma de pago");
        String formaPago = leer.next().toUpperCase();

        if(formaPago.equals(pagoUno)){
        System.out.println("Su cuota inicial es de"+(cuotaInicial - ((cuotaInicial)*0.10)) + "y su precio de venta es de" + precioVenta);
        }else if (formaPago.equals(pagoDos)){
        System.out.println("Su cuota inicial es de"+(cuotaInicial + ((cuotaInicial)*0.08)) + "y su precio de venta es de" + precioVenta);
        }

    }

}