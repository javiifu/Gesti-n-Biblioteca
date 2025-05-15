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
            opcion = sc.nextInt();
    
            sc.next();

            switch (opcion) {
                case 1:
                    añadirlibro();
                case 2:
                    mostrarLibroIsbn();
                case 3:
                    mostrarLibroAutor();
                case 4: 
                    mostrarLibroTitulo(); 
                case 5:
                    mostrarLibros();
            }
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

    public void mostrarLibroIsbn(){
        int respuesta;
        System.out.println("Ha elegido buscar un libro por ISBN:");
        System.out.println("Introduzca el ISBN a buscar: ");
        respuesta = sc.nextInt();
        sc.next();
        for (Libro libro: Libros){
            if (respuesta == libro.getIsbn()){
                System.out.println("El libro que busca es el siguiente"+libro);
            }
        }
    }
    public void mostrarLibroAutor (){
        String respuesta;
        System.out.println("Ha elegido la opción de buscar un libro por autor");
        System.out.println("Introduzca el nómbre del autor");
        respuesta = sc.nextLine();
        sc.next();
        for (Libro libro : Libros){
            if(respuesta.equals(libro.getAutor())){
                System.out.println("Se ha encontrado el siguiente libro del autor: "+libro);
            }
        }
    }
    public void mostrarLibroTitulo(){
        String respuesta;
        System.out.println("Ha elegido la opción de buscar un libro por título");
        System.out.println("Introduzca el nómbre del título");
        respuesta = sc.nextLine();
        sc.next();
        for (Libro libro : Libros){
            if(respuesta.equals(libro.getTitulo())){
                System.out.println("El libro que busca es el siguiente: "+ libro);
            }
        }
    }
    public void mostrarLibros(){
        System.out.println("Mostrando todos los libros guardados");
        for (Libro libro:Libros){
            System.out.println(libro);
        }
    }
}
