import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Miscelanea ms = new Miscelanea();
        GestorFicheroLibros gestor = new GestorFicheroLibros();
        gestor.cargarLibros();
        ms.mostrarMenu();
        

    }
}
