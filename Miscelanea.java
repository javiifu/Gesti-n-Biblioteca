import java.util.Scanner;



import java.util.ArrayList;

public class Miscelanea {
    Scanner sc = new Scanner(System.in);
    GestorFicheroLibros gestor = new GestorFicheroLibros();
    ArrayList<Libro> Libros = gestor.cargarLibros();
    //Atributos 

    int opcion;
    public void cargarLibros(){
        Libros = gestor.cargarLibros();
    }
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
        //verificacion de ISBN duplicado
        boolean isbnDuplicado;
        do {
            isbnDuplicado = false;
            for (Libro libro : Libros) {
                if (Isbn == libro.getIsbn()) {
                    System.out.println("No puede haber ISBN duplicados");
                    System.out.println("Introduzca un nuevo ISBN: ");
                    Isbn = sc.nextLong();
                    isbnDuplicado = true;
                    break;
                }
            }
        } while (isbnDuplicado);
        System.out.println("Por último, introduzca el año de publicación: ");
        año_publicacion = sc.nextInt();
        //Creamos el objeto libro. 
        Libro libro = new Libro(titulo, autor, Isbn, año_publicacion);
        //Guardamos el libro en el array list. 
        Libros.add(libro);
        //Guardamos el libro una vez creado. Para que se haga automáticamente. 
        gestor.guardarLibros(Libros, false);

        System.out.println("Libro creado correctamente.");
    }

    public void mostrarLibroIsbn(){
        long respuesta = 0; // Initialize with a default value
        boolean verificador = false;
        System.out.println("Ha elegido buscar un libro por ISBN:");
        do{
            System.out.print("Introduzca el ISBN a buscar: "); 
            if (sc.hasNextLong()) {
                respuesta = sc.nextLong();
                int longitud = String.valueOf(respuesta).length();
                
                if (longitud == 13){
                    verificador = true;
                }
                else{
                    System.out.println("Entrada inválida. Introduzca un número de 13 dígitos.");
                }
            }
            else {
                System.out.println("Entrada inválida. Introduzca un número de 13 dígitos.");
                sc.next(); // Limpiar el buffer.
            }
        }while (!verificador);
        
        
        for (Libro libro: Libros){
            if (respuesta == libro.getIsbn()){
                System.out.println("El libro que busca es el siguiente: "+libro);
                break; //terminamos el bucle for si es encontrado, porque el valor el único. 

            }
            else{
                System.out.println("No se ha encontrado ningún libro que tenga es ISBN");
            }
        }
    }
    public void mostrarLibroAutor (){
        String respuesta;
        boolean verificador = false;
        System.out.println("Ha elegido la opción de buscar un libro por autor");
        
        do{
            System.out.println("Introduzca el nómbre del autor");
            respuesta = sc.nextLine();
            if (respuesta.isEmpty()){
                System.out.println("No puede estar en blanco su respuesta.");
            }
            else if (respuesta instanceof String){
                verificador = true;
            }
            else{
                System.out.println("Introduzca un cadena de texto, porfavor.");
            }
        }while(!verificador);

        for (Libro libro : Libros){
            if(respuesta.equals(libro.getAutor())){
                System.out.println("Se ha encontrado el siguiente libro del autor: "+libro);
            }
            else{
                System.out.println("No se ha encontrado ningún libro con ese autor.");
            }
        }
        
    }
    public void mostrarLibroTitulo(){
        String respuesta;
        boolean verificador = false;
        System.out.println("Ha elegido la opción de buscar un libro por título");
       
       do{
        System.out.println("Introduzca el nómbre del título");
        respuesta = sc.nextLine();
        if (respuesta.isEmpty()){
            System.out.println("No puede estar en blanco su respuesta.");
        }
        else if (respuesta instanceof String){
            verificador = true;
        }
        else{
            System.out.println("Introduzca una cadena de texto porfavor.");
        }
       }while(!verificador);
        for (Libro libro : Libros){
            if(respuesta.equals(libro.getTitulo())){
                System.out.println("El libro que busca es el siguiente: "+ libro.toString());
                
            }
            else{
                System.out.println("No se ha encontrado ningún libro ");
            }
        }
        
        
    }
    public void mostrarLibros(){
        gestor.cargarLibros();
        System.out.println("Mostrando todos los libros guardados:");
        for (Libro libro:Libros){
            System.out.println(libro.toString());
            
        }
        if (Libros == null){
            System.out.println("No se ha encontrado ningún libro.");
        }
        System.out.println("----------------------------------------------------------"); //Estetica para que salga de nuevo al menú
        
    }
}
