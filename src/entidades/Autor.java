package entidades;

import dataBase.BaseDatos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private String fechaNacimiento;
    private List<Publicacion> obrasPublicadas;


    public Autor() {
    }


    public Autor(String nombre, String nacionalidad, String fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.obrasPublicadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void obtenerInfo() {
        String infoAutor = "Autor{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", obrasPublicadas=" + obrasPublicadas +
                '}';
        System.out.println(infoAutor);
    }

    public static Comparator<Autor>  OrderByAscName = Comparator.comparing(Autor::getNombre);
    public static Comparator<Autor>  OrderByDecName = Comparator.comparing(Autor::getNombre).reversed();
    public static Comparator<Autor>  OrderByAscNacionality = Comparator.comparing(Autor::getNombre);
    public static Comparator<Autor>  OrderByDecNacionality = Comparator.comparing(Autor::getNombre).reversed();




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nombre, autor.nombre) && Objects.equals(nacionalidad, autor.nacionalidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nacionalidad);
    }
}

