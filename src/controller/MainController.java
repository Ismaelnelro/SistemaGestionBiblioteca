package controller;

import views.Menu;

public class MainController {
    private AutorController autorController;
    private LibroController libroController;
    private RevistaController revistaController;
    private UserController usuarioController;
    private PrestamosController prestamosController;

    private Menu menu;

    public MainController() {
        this.autorController = new AutorController();
        this.libroController = new LibroController();
        this.revistaController = new RevistaController();
        this.usuarioController = new UserController();
        this.prestamosController = new PrestamosController();
        this.menu = new Menu();
    }

    public void autorController(int opcion) {
        String value;
        switch (opcion) {
            case 1:
                autorController.create(menu.FormCreateAutor());
                break;
            case 2:
                autorController.update();
                break;
            case 3:
                opcion = menu.DevolverOpcionDeMenu(menu.showCriteriaSearchFrom("autor"));
                value = menu.valueToSeach();
                autorController.readOne(value, opcion);
                break;
            case 4:
                opcion = menu.DevolverOpcionDeMenu(menu.showCriteriaSearchFrom("autores"));
                autorController.readAll(opcion);
                break;
            case 5:
                autorController.delete();
                break;
        }
    }

    public void publicaciones(int opcion, int type) {
        if (type == 1) libroController(opcion);
        if (type == 2) revistaController(opcion);
    }

    private void libroController(int opcion) {
        switch (opcion) {
            case 1:
                libroController.create();
                break;
            case 2:
                libroController.update();
                break;
            case 3:
                libroController.readOne();
                break;
            case 4:
                libroController.readAll();
                break;
            case 5:
                libroController.delete();
                break;
        }
    }

    private void revistaController(int opcion) {
        switch (opcion) {
            case 1:
                revistaController.create();
                break;
            case 2:
                revistaController.update();
                break;
            case 3:
                revistaController.readOne();
                break;
            case 4:
                revistaController.readAll();
                break;
            case 5:
                revistaController.delete();
                break;
        }
    }

    public void prestamosController(int opcion) {
        switch (opcion) {
            case 1:
                prestamosController.create();
                break;
            case 2:
                prestamosController.update();
                break;
            case 3:
                prestamosController.readOne();
                break;
            case 4:
                prestamosController.readAll();
                break;
            case 5:
                prestamosController.delete();
                break;
        }
    }

    public void usuarioController(int opcion) {
        switch (opcion) {
            case 1:
                usuarioController.create(menu.FormCreateUser());
                break;
            case 2:
                usuarioController.update();
                break;
            case 3:
//                usuarioController.readOne();
                break;
            case 4:
                usuarioController.readAll();
                break;
            case 5:
                usuarioController.delete();
                break;
        }
    }

}
