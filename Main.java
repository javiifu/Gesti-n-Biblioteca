import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Miscelanea ms = new Miscelanea();
        GestorFicheroLibros gestor = new GestorFicheroLibros();
        gestor.cargarLibros();
        int opcion;
        do {
            System.out.println("1. Añadir un nuevo libro");
            System.out.println("2. Buscar libro por ISBN");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Buscar libro por título");
            System.out.println("5. Mostrar todos los libros registrados. ");
            System.out.println("6. Salir.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ms.añadirlibro();
                case 2:
                    ms.mostrarLibroIsbn();
                case 3:
                    ms.mostrarLibroAutor();
                case 4: 
                    ms.mostrarLibroTitulo(); 
                case 5:
                    ms.mostrarLibros();
            }
        } while (opcion != 6);
        sc.close();

    }
}
