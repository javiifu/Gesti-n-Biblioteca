import java.io.*;
import java.util.ArrayList;

public class GestorFicheroLibros {
    // Atributos
    private final String RUTA = "Ficheros/libros.txt";

    // Método Guardar libros.

    public void guardarLibros(ArrayList<Libro> libros, boolean añadirFinal) { // Pongo el boleeano de añadirAl final
                                                                              // para que no siempre se tenga que
                                                                              // soobreescribir el archivo.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA, añadirFinal))) {
            // Recoremos el Arraylist de Libros y los guardamos.
            for (Libro libro : libros) {
                bw.write(libro.toString());
                bw.newLine(); // Hacemos un salto de línea.
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los libros por: " + e.getMessage());
            ; // Handle the exception (e.g., log it or rethrow it)
        }
    }

    public ArrayList<Libro> cargarLibros() {
        ArrayList<Libro> Libros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Libro libro = Libro.particionString(linea);
                if (libro != null) {
                    Libros.add(libro);
                }
            }
        }

        catch (IOException e) {
            System.out.println("Error al cargar los libros por: " + e.getMessage());
        }
        return Libros;
    }


}
