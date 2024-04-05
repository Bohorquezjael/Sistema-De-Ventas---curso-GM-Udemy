package mx.com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];   //* Posible mejora: usar una lista dinamica para los productos
    private static int contadorOrdenes;
    private final static int MAX_PRODUCTOS = 10;

    public Orden(){
        Orden.contadorOrdenes++;
        this.idOrden = Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(productos[Orden.MAX_PRODUCTOS - 1] != null){
            System.out.println("Se ha superado el máximo de productos: " + MAX_PRODUCTOS);
            return;
        }else{
            //* usando la lista podemos evitar el uso de for y controlar de mejor manera 
            //* el maximo de productos o ayudarnos de una var aux para llevar el control
            for (int i = 0; i < productos.length; i++) {
                if(productos[i] == null){
                    productos[i] = producto;
                    return;
                }
            }
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (Producto producto : productos) {
            if(producto == null){
                break;
            }
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        // TODO implementar el manejo de archivos y manejar la salida como un archivo el cual
        // sera nuestro ticket 
        System.out.println("Orden #: " + idOrden);
        System.out.println("Total de la orden: $" + calcularTotal());
        System.out.println("Productos de la orden:");
        for (Producto producto : productos) {
            if(producto != null){
                System.out.println(producto);
            }
        }
    }
}
