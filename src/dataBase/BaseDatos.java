package dataBase;

import entidades.Autor;
import entidades.Libro;
import entidades.Publicacion;
import entidades.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BaseDatos {

    private static BaseDatos instance;
    private Set<Autor> BaseDatosAutores;
    private List<Publicacion> BaseDatosLibros;
    private List<Publicacion> BaseDatosRevistas;
    private List<Usuario> BaseDatosUsuarios;

    public BaseDatos() {
        BaseDatosUsuarios = new ArrayList<>();
        BaseDatosLibros =  new ArrayList<>();
        BaseDatosRevistas = new ArrayList<>();
        BaseDatosAutores = new TreeSet<>(Autor.OrderByAscName);
    }

    public static BaseDatos getInstance() {
        if (instance == null) {
            instance = new BaseDatos();
        }
        return instance;
    }

    public void addNewAutor(Autor autor) {
        this.BaseDatosAutores.add(autor);
    }

    public void addNewUsuario(Usuario usuario) {
        this.BaseDatosUsuarios.add(usuario);
    }

    public Set<Autor> getAllAutor(){
        return BaseDatosAutores;
    }


    public Usuario getUsuario(String name){
        Usuario usuarioToReturn = new Usuario();
        for (Usuario usuario: BaseDatosUsuarios){
            if (usuario.getNombre().equalsIgnoreCase(name)){
                usuarioToReturn.setNombre(usuario.getNombre());
                usuarioToReturn.setFechaNacimiento(usuario.getFechaNacimiento());
                return  usuarioToReturn;
            }
        }
        return usuarioToReturn;
    }

}
