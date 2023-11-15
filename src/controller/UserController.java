package controller;

import entidades.Usuario;
import servicio.UsuariosService;

public class UserController {

    UsuariosService service;

    public UserController() {
        service = new UsuariosService();
    }

    ;

    public void create(String[] data) {
        try {
            service.crearUsuario(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update() {
        System.out.println("Creando");
    }

    public void readOne(String name) {
        try {
            service.read(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void readAll() {
        System.out.println("Creando");
    }

    public void delete() {
        System.out.println("Creando");
    }
}
