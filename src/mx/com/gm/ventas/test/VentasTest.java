package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Orden orden1 = new Orden();
        orden1.agregarProducto(new Producto("Pantalla", 5700.96));
        orden1.agregarProducto(new Producto("Teclado", 320.45));
        orden1.agregarProducto(new Producto("Mouse", 45.75));
        orden1.agregarProducto(new Producto("Auriculares", 120.0));
        orden1.agregarProducto(new Producto("Impresora", 220.99));
        orden1.agregarProducto(new Producto("Altavoces", 180.25));
        orden1.agregarProducto(new Producto("Cámara", 450.60));
        orden1.agregarProducto(new Producto("Micrófono", 89.99));
        System.out.println(orden1.calcularTotal());

        orden1.mostrarOrden();
    }
}
