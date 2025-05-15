import java.io.Serializable;

public class Libro implements Serializable{ //Hay que hacerlo Serializable para poder trabajar la persistencia. 

    //Atributos
    private String Titulo;
    private String Autor;
    private long Isbn; //Variable tipo loong para que puedan caber los 13 dígitos del ISBN
    private int Año_Publicacion;
    //Constructor
    public Libro (String Titulo, String Autor, long Isbn, int Año_Publicacion){
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Isbn = Isbn;
        this.Año_Publicacion = Año_Publicacion;
    }
    //Métodos get y set. 
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo){
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor){
        this.Autor = Autor;
    }
    
    public long getIsbn() {
        return Isbn;
    }

    public void setIsbn(long Isbn){
        this.Isbn = Isbn;
    }
    
    public int getAñoPublicacion() {
        return Año_Publicacion;
    }

    public void setAñoPublicacion(int Año_Publicacion){
        this.Año_Publicacion = Año_Publicacion;
    }
    //Modificamos la clase toString con un Overrride
    @Override
    public String toString(){
        return Titulo+";"+Autor+";"+Isbn+";"+Año_Publicacion;
    }
    //Creación del método particionString para  poder leerlo en el fichero. 
    public static Libro particionString(String linea) {
        String [] partes = linea.split(";");
        //Verificacion de que hay 4 partes en el libro.
        if (partes.length != 4) {
            System.out.println("La línea esta mal formada"+ linea);
            return null;
        }
        try{
            String titulo = partes[0];
            String autor = partes[1];
            long isbn = Long.parseLong(partes[2]);
            int anio = Integer.parseInt(partes[3]);

            return new Libro(titulo, autor, isbn, anio);
        } 
        catch (NumberFormatException e) {
            System.out.println("Error al convertir datos numéricos en línea: " + linea);
            return null;
        }
        
    }
}
