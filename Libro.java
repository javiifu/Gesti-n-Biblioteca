public class Libro {

    //Atributos
    private String Titulo;
    private String Autor;
    private int Isbn;
    private int Año_Publicacion;
    //Constructoru
    public Libro (String Titulo, String Autor, int Isbn, int Año_Publicacion){
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
    
    public int getIsbn() {
        return Isbn;
    }

    public void setIsbn(int Isbn){
        this.Isbn = Isbn;
    }
    
    public int getAñoPublicacion() {
        return Año_Publicacion;
    }

    public void setAñoPublicacion(int Año_Publicacion){
        this.Año_Publicacion = Año_Publicacion;
    }
    
}
