import java.util.Scanner;

public class Menu {
    
    Scanner sc = new Scanner(System.in);
    
    //Atributos 

    int opcion;

    public void mostrarMenu() {
        do {
            System.out.println("1. Añadir un nuevo libro");
            System.out.println("2. Buscar libro por ISBN");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Buscar libro por título");
            System.out.println("5. Mostrar todos los libros registrados. ");
            System.out.println("6. Salir.");
        } while (opcion != 6);
    }

    public void 
}
