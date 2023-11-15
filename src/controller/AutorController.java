package controller;

import servicio.AutorService;

import java.util.Arrays;

public class AutorController {

    AutorService autorService;
    public AutorController(){
        autorService = new AutorService();
    };

    public void create(String[]data){
        try {
            autorService.createAuthor(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void update(){
        System.out.println("Creando");
    }
    public void readOne(String value, int option){
        try{
            autorService.readBy(value,option);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void readAll(int option){
        try{
            autorService.readALl(option);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void delete(){
        System.out.println("Creando");
    }

}
