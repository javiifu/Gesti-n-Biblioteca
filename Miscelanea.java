import java.util.Scanner;
import java.util.ArrayList;

public class Miscelanea {
    Scanner sc = new Scanner(System.in);
    GestorFicheroLibros gestor = new GestorFicheroLibros();
    ArrayList<Libro> Libros = new ArrayList<>();
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

    public void añadirlibro(){
        String titulo;
        String autor;
        int Isbn;
        int año_publicacion;
        System.out.println("Introduzca título del Libro: ");
        titulo = sc.nextLine();
        sc.next();
        System.out.println("Introduzca que autor escribió el libro: ");
        autor = sc.nextLine();
        sc.next();
        System.out.println("Introduzca ISBN: ");
        Isbn = sc.nextInt();
        sc.next();
        System.out.println("Por último, introduzca el año de publicación: ");
        año_publicacion = sc.nextInt();
        sc.next();
        //Creamos el objeto libro. 
        Libro libro = new Libro(titulo, autor, Isbn, año_publicacion);
        //Guardamos el libro en el array list. 
        Libros.add(libro);
        //Guardamos el libro una vez creado. Para que se haga automáticamente. 
        gestor.guardarLibros(Libros, true);
    }
}
