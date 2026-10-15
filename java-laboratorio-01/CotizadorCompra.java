import java.util.Scanner;

public class CotizadorCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Producto: ");
        String producto = scanner.nextLine();

        System.out.println("Precio: ");
        int precio = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cantidad: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Porcentaje de descuento: ");
        int descuento = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Porcentaje de impuesto: ");
        int impuesto = scanner.nextInt();
        
        //Se Calcula el subtotal de toda la compra.
        double Subtotal = precio * cantidad;

        //Se Calcula y aplica el descuento al subtotal.
        double calculoDescuento = descuento / 100.0;
        double ValorDescuento = Subtotal * calculoDescuento;

        //Del calculo anterior se obtiene la base.
        double base = Subtotal - ValorDescuento;

        //Despues calculamos el impuesto usando el subtotal.
        double calculoImpuesto = impuesto / 100.0;
        double Impuesto = base * calculoImpuesto;

        //Despues se agrega la base mas el impuesto para obtener el total.
        double total = base + Impuesto;


        System.out.println("=====================");
        System.out.println(" COTIZADOR JAVA ");
        System.out.println("=====================");

        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Producto: " + producto);
        System.out.println("Precio unitario: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Descuento (%): " + descuento);
        System.out.println("Impuesto (%): " + impuesto);

        System.out.println("=====================");
        System.out.println(" RESUMEN DE COMPRA ");
        System.out.println("=====================");

        System.out.println("Cliente: " + nombre);
        System.out.println("Producto: " + producto);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + Subtotal);
        System.out.println("Descuento: $" + ValorDescuento);
        System.out.println("Base: $" + base);
        System.out.println("Impuesto: $" + Impuesto);
        
        System.out.println("TOTAL: $" + total);

        scanner.close();
    }
}
