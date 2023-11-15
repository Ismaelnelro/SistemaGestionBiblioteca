package app;

import controller.MainController;
import views.Menu;

public class App {
    private Menu menu;
    private MainController mainController;
    private int opcion;
    private int cantidadOpcionesMenu;
    private int cantidadOpcionesCrud;

    public App() {
        config();
    }

    private void config() {
        menu = new Menu();
        mainController = new MainController();
    }

    public void ejecutable() {
        do {
            cantidadOpcionesMenu = menu.MostarMenuPrincipal();
            opcion = menu.DevolverOpcionDeMenu(cantidadOpcionesMenu);

            if (opcion != cantidadOpcionesMenu){
                cantidadOpcionesCrud = menu.MostrarMenuCRUD();
            }

            switch (opcion){
                case 1:
                    opcion = menu.DevolverOpcionDeMenu(this.cantidadOpcionesCrud);
                    mainController.autorController(opcion);
                    break;
                case 2:
                    opcion = menu.DevolverOpcionDeMenu(this.cantidadOpcionesCrud);
                    System.out.println("Desea efectuar la accion sobre un Libro o Revista");
                    System.out.println("1. Libro");
                    System.out.println("2. Revista");
                    mainController.publicaciones(opcion, menu.DevolverOpcionDeMenu(2));
                    break;
                case 3:
                    opcion = menu.DevolverOpcionDeMenu(this.cantidadOpcionesCrud);
                    mainController.prestamosController(opcion);
                    break;
                case 4:
                    opcion = menu.DevolverOpcionDeMenu(this.cantidadOpcionesCrud);
                    mainController.usuarioController(opcion);
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
            }
        } while (opcion != cantidadOpcionesMenu);

    }


}
