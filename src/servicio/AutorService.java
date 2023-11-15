package servicio;

import dataBase.BaseDatos;
import entidades.Autor;
import entidades.Usuario;

import java.util.*;

public class AutorService {
    public AutorService() {
    }

    public void createAuthor(String[] data) throws Exception {
        try {
            String nombre = data[0];
            String nacionalidad = data[1];
            String fechaNacimeinto = data[2];
            Autor newAutor = new Autor(nombre, nacionalidad, fechaNacimeinto);
            BaseDatos baseDatos = BaseDatos.getInstance();
            baseDatos.addNewAutor(newAutor);
        } catch (Exception ex) {
            throw new Exception("Error al crear autor " + ex.getMessage());
        }
    }
    public void readBy(String value, int option) throws Exception {
        try {
            switch (option) {
                case 1 -> filterByName(value);
                case 2 -> filterByNationality(value);
            }

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    public void filterByName(String name) {
        for (Autor autor : BaseDatos.getInstance().getAllAutor()) {
            if (autor.getNombre().contains(name)) {
                autor.obtenerInfo();
            }
        }
    }
    public void filterByNationality(String nationality) {
        for (Autor autor : BaseDatos.getInstance().getAllAutor()) {
            if (autor.getNacionalidad().contains(nationality)) {
                autor.obtenerInfo();
            }
        }
    }
    public void readALl(int option) throws Exception {

        try {
            BaseDatos baseDatos = BaseDatos.getInstance();
            List<Autor> autoresList = new ArrayList<>(baseDatos.getAllAutor());
            switch (option) {
                case 1 -> autoresList.sort(Autor.OrderByAscName); //Esto ya se realiza hay que corregirlo
                case 2 -> autoresList.sort(Autor.OrderByDecName);
                case 3 -> autoresList.sort(Autor.OrderByAscNacionality);
                case 4 -> autoresList.sort(Autor.OrderByDecNacionality);
            }
            for (Autor autor : autoresList) {
                autor.obtenerInfo();
            }

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }


}
