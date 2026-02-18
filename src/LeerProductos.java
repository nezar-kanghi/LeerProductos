import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerProductos {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("productos.txt"))) {

            String linea;

            while ((linea = reader.readLine()) != null) {

                // Separar nombre y precio usando la coma
                String[] partes = linea.split(",");

                if (partes.length == 2) {
                    String nombre = partes[0];
                    String precio = partes[1];

                    System.out.println("Producto: " + nombre + " - Precio: " + precio + "€");
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
