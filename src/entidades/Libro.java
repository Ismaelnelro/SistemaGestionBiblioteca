package entidades;

public class Libro extends Publicacion {
    private String genero;

    public Libro(String titulo, Autor autor, int anoPublicacion, String genero) {
        super(titulo, autor, anoPublicacion);
        this.genero = genero;
    }

    public String obtenerGenero() {
        return genero;
    }

    public void prestar(Usuario usuario) {
        // Lógica de préstamo
    }

    public void devolver(Usuario usuario) {
        // Lógica de devolución
    }
}
