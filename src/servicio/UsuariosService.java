package servicio;

import dataBase.BaseDatos;
import entidades.Autor;
import entidades.Prestamo;
import entidades.Usuario;

import java.util.List;

public class UsuariosService {
    public UsuariosService() {
    }

    public void crearUsuario(String[] data) throws Exception {
        try {
            String nombre = data[0];
            String fechaNacimeinto = data[2];
            Usuario newUsuario = new Usuario(nombre, fechaNacimeinto);
            BaseDatos baseDatos = BaseDatos.getInstance();
            baseDatos.addNewUsuario(newUsuario);
        } catch (Exception ex) {
            throw new Exception("Error al crear usuario" + ex.getMessage());
        }
    }


    public void read(String name) throws Exception {
        try {
            BaseDatos baseDatos = BaseDatos.getInstance();
            Usuario usuario = baseDatos.getUsuario(name);
            usuario.obtenerInfo();
            if (usuario == null) throw new Exception("No se encontro el usuario");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
