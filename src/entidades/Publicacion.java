package entidades;

public class Publicacion {
    private String titulo;
    private Autor autor;
    private int anoPublicacion;
    private boolean disponible;

    public Publicacion(String titulo, Autor autor, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.disponible = true;
    }

    public String obtenerInfo() {
        return String.format("Título: %s\nAutor: %s\nAño de Publicación: %d\nDisponible: %s",
                titulo, autor.getNombre(), anoPublicacion, disponible ? "Sí" : "No");
    }

    public boolean verificarDisponibilidad() {
        return disponible;
    }
}

