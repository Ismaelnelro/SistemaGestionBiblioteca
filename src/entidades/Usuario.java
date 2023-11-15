package entidades;


import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private int id;
    private String fechaNacimiento;
    private List<Prestamo> prestamos;
    private static int contador;

    public Usuario() {
    }

    ;

    public Usuario(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.id = contador++;
        this.fechaNacimiento = fechaNacimiento;
        this.prestamos = new ArrayList<>();
    }

    public void obtenerInfo() {
        String infoUsuario = "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", prestamos=" + prestamos +
                '}';
        System.out.println(infoUsuario);
    }

    public void realizarPrestamo(Publicacion publicacion) {
        // Lógica para realizar un préstamo
    }

    public void devolverPrestamo(Prestamo prestamo) {
        // Lógica para devolver un préstamo
    }

    public List<Prestamo> historialPrestamos() {
        return prestamos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Usuario.contador = contador;
    }

}


