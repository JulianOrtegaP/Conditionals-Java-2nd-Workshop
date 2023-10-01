package punto3;


// Se tiene un código, número de artículos vendidos y el valor
// del artículo con ese código. Calcule el valor de la compra,
// teniendo en cuenta lo siguiente: si la compra es de 50 o
// más artículos se le da al cliente 10% de descuento; si la
// compra es menor de 50 artículos no se hace descuento.
// Mostrar el código, el total de la compra y el valor del
// descuento.

public class App {

    static String codigo = "12345ABC";
    static Integer articulosVendidos = 40;
    static Double valorArticulo = 2000.0;

    public static void main(String[] args) {

        if(articulosVendidos>=50) {
            System.out.println("su total de pago del producto"+codigo+ "es"+((articulosVendidos*valorArticulo)-((articulosVendidos*valorArticulo)*0.10))+"tienes un descuento del 10% equivalente a"+ ((articulosVendidos*valorArticulo)*0.10));
        }else if(articulosVendidos<50){
            System.out.println("No tiene descuento el producto"+codigo+"debe cancelar"+(articulosVendidos*valorArticulo));
        }
        
    }
    
}
