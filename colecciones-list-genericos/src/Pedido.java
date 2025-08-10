public class Pedido {
    String producto;
    double precio;

    Pedido(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }
    public String toString(){
        return producto + " - $" + precio;
    }
}
