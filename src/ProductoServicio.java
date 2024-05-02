import java.util.ArrayList;

public class ProductoServicio {

    private static ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    // public ProductoServicio() {
    // this.listaProductos = new ArrayList<>();
    // }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        ProductoServicio.listaProductos = listaProductos;
    }

    public static void agregarProductos(Producto producto) {
        listaProductos.add(producto);
    }

    public static void listarProductos() {
        for (Producto producto : listaProductos) {
            System.out.println("datos del producto");
            System.out.println("Articulo" + producto.getArticulo());
            System.out.println("Precio" + producto.getPrecio());
            System.out.println("Descripcion" + producto.getDescripcion());
            System.out.println("Código" + producto.getCodigo());
            System.out.println("Talla:" + producto.getTalla());
            System.out.println("Marca:" + producto.getMarca());
            System.out.println("Color" + producto.getColor());

        }
    }

}
