package ui;

import java.util.Scanner;
import model.Controller;

public class Vivendo {

    Controller control;
    Scanner reader;

    public Vivendo() {

        control = new Controller();
        reader = new Scanner(System.in);

    }

    public static void main(String[] args) {

        Vivendo exe = new Vivendo();
        exe.menu();
    }
    
    /** 
     * Descripcion: Despliega el menu principal de funcionalidades al usuario
    */
    private void menu() {

        boolean flag = true;

        do {

            System.out.println("\nBienvenido a Vivendo!");
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("----------------------");
            System.out.println("1) Registrar un Edificio");
            System.out.println("2) Registrar Apartamento en un Edificio");
            System.out.println("3) Consultar Apartamentos disponibles en un Edificio");
            System.out.println("4) Consultar el valor mensual total de arrendamiento");
            System.out.println("0) Salir");
            int option = reader.nextInt();

            switch (option) {
                case 1:
                    registrarEdificio();
                    break;
                case 2:
                    registrarApartamentoEnEdificio();
                    break;
                case 3:
                    consultarApartamentosDisponiblesEnEdificio();
                    break;
                case 4:
                    consultarValorMensualArrendamiento();
                    break;

                case 0:
                    System.out.println("Gracias por usar nuestros servicios. Adios!");
                    flag = false;
                    break;

                default:
                    System.out.println("Opcion invalida, intente nuevamente");
                    break;
            }

        } while (flag);

    }

    /** 
     * Descripcion: Solicita al usuario la informacion necesaria para registrar un Edificio en el sistema
    */
    public void registrarEdificio() {

        reader.nextLine();

    }

     /** 
     * Descripcion: Solicita al usuario la informacion necesaria para registrar un Apartamento en un Edificio en el sistema
    */
    public void registrarApartamentoEnEdificio() {
        reader.nextLine();
    }

     /** 
     * Descripcion: Muestra al usuario el numero de Apartamentos disponibles a ser arrendados en un Edificio 
    */
    public void consultarApartamentosDisponiblesEnEdificio() {

    }

    /** 
     * Descripcion: Muestra al usuario el valor en dinero mensual correspondiente a todas las propiedades arrendadas
    */
    public void consultarValorMensualArrendamiento() {

    }

}