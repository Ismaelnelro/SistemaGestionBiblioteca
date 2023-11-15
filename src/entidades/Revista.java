package entidades;

public class Revista extends Publicacion {
    private int numero;
    private String mes;

    public Revista(String titulo, Autor autor, int anoPublicacion, int numero, String mes) {
        super(titulo, autor, anoPublicacion);
        this.numero = numero;
        this.mes = mes;
    }

    public String obtenerPeriodicidad() {
        return mes;
    }

    public void publicarNuevaEdicion() {
        // Lógica para publicar una nueva edición
    }
}
