import java.util.Scanner;
import java.util.ArrayList;

public class Miscelanea {
    Scanner sc = new Scanner(System.in);
    GestorFicheroLibros gestor = new GestorFicheroLibros();
    ArrayList<Libro> Libros = new ArrayList<>();
    //Atributos 

    int opcion;

    public void añadirlibro(){
        String titulo;
        String autor;
        long Isbn;
        int año_publicacion;
        System.out.println("Introduzca los parámetros que se le piden: ");
        System.out.println("Introduzca título del Libro: ");
        titulo = sc.nextLine();
        System.out.println("Introduzca que autor escribió el libro: ");
        autor = sc.nextLine();
        System.out.println("Introduzca ISBN: ");
        Isbn = sc.nextLong();
        System.out.println("Por último, introduzca el año de publicación: ");
        año_publicacion = sc.nextInt();
        //Creamos el objeto libro. 
        Libro libro = new Libro(titulo, autor, Isbn, año_publicacion);
        //Guardamos el libro en el array list. 
        Libros.add(libro);
        //Guardamos el libro una vez creado. Para que se haga automáticamente. 
        gestor.guardarLibros(Libros, true);
    }

    public void mostrarLibroIsbn(){
        long respuesta;
        System.out.println("Ha elegido buscar un libro por ISBN:");
        System.out.println("Introduzca el ISBN a buscar: ");
        respuesta = sc.nextLong();
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
            System.out.println(libro.toString());
        }
    }
}
