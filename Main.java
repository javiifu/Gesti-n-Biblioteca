
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Miscelanea ms = new Miscelanea();        
        int opcion;
        do {
            ms.cargarLibros();
            System.out.println("Bienvenido al menú. ¿Qué desea hacer?");
            System.out.println("1. Añadir un nuevo libro");
            System.out.println("2. Buscar libro por ISBN");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Buscar libro por título");
            System.out.println("5. Mostrar todos los libros registrados.");
            System.out.println("6. Salir.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ms.añadirlibro();
                    break;
                case 2:
                    ms.mostrarLibroIsbn();
                    break;
                case 3:
                    ms.mostrarLibroAutor();
                    break;
                case 4: 
                    ms.mostrarLibroTitulo();
                    break; 
                case 5:
                    ms.mostrarLibros();
                    break;
            }
        } while (opcion != 6);
        sc.close();

    }
}
