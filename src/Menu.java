import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private ProductoServicio productoServicio;
    private ArchivoServicio archivoServicio;

    public Menu() {
        scanner = new Scanner(System.in);
        productoServicio = new ProductoServicio();
        archivoServicio = new ArchivoServicio();
    }

    public static void mostrarMenu() throws Exception {
        int opcion;
        do {
            System.out.println("1 Listar Producto");
            System.out.println("2 Agregar Datos");
            System.out.println("3 Importar Datos");
            System.out.println("4 Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    ProductoServicio.listarProductos();
                    break;
                case 2:
                    ProductoServicio.agregarProductos(leerProducto());
                    break;
                case 3:
                    archivoServicio.cargarDatos();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 4);
        scanner.close();
    }

    private Producto leerProducto() {
        System.out.println("Ingrese los datos del producto:");
        System.out.print("Artículo: ");
        String articulo = scanner.nextLine();
        System.out.print("Precio: ");
        String precio = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Talla: ");
        String talla = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();

        return new Producto(articulo, precio, descripcion, codigo, talla, marca, color);
    }

    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}

