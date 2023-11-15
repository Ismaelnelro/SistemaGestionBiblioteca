package views;

import java.util.*;

public class Menu {
    private Scanner sc;
    private Scanner scLine;

    public Menu() {
        sc = new Scanner(System.in);
        scLine = new Scanner(System.in);
    }



    public int MostarMenuPrincipal() {

        String[] opcionesMenu = {
                "=== Menú Principal ===",
                "1. Autor",
                "2. Publicacion",
                "3. Prestamos",
                "4. Usuarios",
                "5. Salir"
        };
        for (String menu : opcionesMenu) {
            System.out.println(menu);
        }
        return opcionesMenu.length - 1;
    }

    public int MostrarMenuCRUD() {
        String[] opcionesMenu = {
                "=== Menú CRUD ===",
                "1. Crear",
                "2. Editar",
                "3. Buscar",
                "4. Listar",
                "5. Eliminar",
                "6. Salir"
        };
        for (String menu : opcionesMenu) {
            System.out.println(menu);
        }
        return opcionesMenu.length - 1;
    }


    /*=====SEARCH FRONTEND===========================================*/
    private List<String> buildInputsList(String fromWho) {
        Map<String, List<String>> criteriaMap = new HashMap<>();
        criteriaMap.put("autor", Arrays.asList("1.Nombre", "2.Nacionalidad "));
        criteriaMap.put("autores", Arrays.asList("1.Nombre asc", "2.Nombre desc", "3.Nacionalidad asc", "4.Nacionalidad desc", "5.Fecha de Nacimiento"));

        criteriaMap.put("libro", Arrays.asList("1.Genero", "2.titulo"));
        criteriaMap.put("libros", Arrays.asList("1.Genero asc", "2.Genero des", "3.Titulo asc", "4.titulo desc"));

        criteriaMap.put("revista", Arrays.asList("1.Titulo"));
        criteriaMap.put("revistas", Arrays.asList("1.Titulo asc", "2.Titulo desc"));

        criteriaMap.put("prestamo", Arrays.asList("1.Fecha inicio", "2.Nombre de usuario"));
        criteriaMap.put("prestamos", Arrays.asList("1.Fecha inicio asc", "2.Fecha inicio desc", "3.Nombre de usuario"));

        criteriaMap.put("usuario", Arrays.asList("1.Nombre", "2.Id de registro"));

        return criteriaMap.get(fromWho);
    }

    public int showCriteriaSearchFrom(String fromWho) {
        List<String> inputs = buildInputsList(fromWho);
        System.out.println("=== Search By ===");
        for (String input : inputs) {
            System.out.println(input);
        }
        return inputs.size();
    }

    public String valueToSeach() {
        System.out.println("Ingrese el parametro de busqueda: ");
        return scLine.nextLine();
    }
    /*================================================================*/

    public int DevolverOpcionDeMenu(int cantidadOpciones) {
        int opcion;
        do {
            try {
                System.out.print("¿Qué acción numérica deseas implementar?: ");
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                opcion = -1;
            }

            if (opcion < 1 || opcion > cantidadOpciones) {
                System.out.println("Lo siento: Has ingresado una opción incorrecta. Las opciones validas son del 1 al " + cantidadOpciones);
            }
        } while (opcion < 1 || opcion > cantidadOpciones);

        return opcion;
    }


    //Todo! validar informacion de form
    public String[] FormCreateAutor() {
        String[] data = new String[3];
        System.out.println("=== FORM CREATE LIBRO ===");
        String[] inputs = {
                "Nombre: ",
                "Nacionalidad: ",
                "Fecha de Nacimiento: "
        };

        for (int i = 0; i < inputs.length; i++) {
            System.out.println(inputs[i]);
            data[i] = scLine.nextLine();
        }
        return data;
    }


    //Todo! validar informacion de form
    public String[] FormCreateUser() {
        String[] data = new String[2];
        System.out.println("=== FORM CREATE USER ===");
        String[] inputs = {"Nombre:", "Fecha de Nacimiento: "};
        for (int i = 0; i < inputs.length; i++) {
            System.out.println(inputs[i]);
            data[i] = scLine.next();
        }
        return data;
    }

    //
    public String[] formActualizarAutor() {
        String[] data = new String[3];
        System.out.println("=== FORM ACTUALZIAR AUTOR ===");
        String[] inputs = {"Nombre: ", "Nacionalidad: ", "Fecha de Nacimiento: "};
        for (int i = 0; i < inputs.length; i++) {
            System.out.println(inputs[i]);
            data[i] = scLine.nextLine();
        }
        return data;
    }


    /*VISTA PARA MOSTARR ENTIDADES*/

}
