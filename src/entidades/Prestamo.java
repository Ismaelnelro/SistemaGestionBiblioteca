package entidades;

import java.util.Date;

import java.util.Date;

public class Prestamo {
    private Publicacion publicacionPrestada;
    private Usuario usuario;
    private Date fechaInicio;
    private Date fechaDevolucionEsperada;
    private boolean devuelto;

    public Prestamo(Publicacion publicacionPrestada, Usuario usuario, Date fechaInicio, Date fechaDevolucionEsperada) {
        this.publicacionPrestada = publicacionPrestada;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucionEsperada = fechaDevolucionEsperada;
        this.devuelto = false;
    }

    public Usuario obtenerUsuario() {
        return usuario;
    }

    public void calcularMulta() {
    }

}


