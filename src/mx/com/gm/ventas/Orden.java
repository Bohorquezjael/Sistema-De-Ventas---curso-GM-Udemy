package mx.com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    final int MAX_PRODUCTOS = 10;

    public Orden(){
        Orden.contadorOrdenes++;
        this.idOrden = Orden.contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(productos[MAX_PRODUCTOS - 1] != null){
            System.out.println("Se ha superado el máximo de productos: " + MAX_PRODUCTOS);
            return;
        }else{
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
