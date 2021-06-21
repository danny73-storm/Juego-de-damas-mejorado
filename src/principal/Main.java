package src.principal;

import java.util.Scanner;

import src.usuarios.*;

public class Main {
    public static void main(String[] args) {

        Main thunder = new Main();
    }
    
    static Scanner leer = new Scanner(System.in);
    private Juego IniciarJuego = new Juego();
    private VectorUsuarios tablaUsuarios = new VectorUsuarios();

    public Main(){

        boolean salir = false;
        boolean regresar4 = false;

        int opcion; // se guarda la opcion del gamePlayer

        while (!salir) {
            System.out.println("\n Aceptas los terminos y condiciones\n");
            System.out.println("1. Si acepto ");
            System.out.println("2. No acepto ");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nBienvenido\n");
                    System.out.println("Ingrese 2 usuarios");
                    System.out.println("------------------");
                    tablaUsuarios.agregarUsuarios();
                    System.out.println();
                    while (!salir) {
                        System.out.println("");
                        System.out.println("------------------");
                        System.out.println("Menu principal");
                        System.out.println("------------------\n");

                        System.out.println("1. Jugar ");
                        System.out.println("2. Agregar mas jugadores");
                        System.out.println("3. Mostrar Jugadores Ingresados");
                        System.out.println("4. Estadisticas y reportes");
                        System.out.println("-1. Salir ");

                        opcion = leer.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("\n###################");
                                System.out.println("### DIVIERTETE ####");
                                System.out.println("###################\n");
                                IniciarJuego.jugar();                          
                                break;
                            case 2:
                                System.out.println("\nIngrese otros jugadores");
                                System.out.println("-----------------------\n");
                                tablaUsuarios.agregarUsuarios();
                                break;     
                            case 3:
                                System.out.println("\nLos jugadores ingresados son: ");
                                System.out.println("-------------------------------\n");
                                tablaUsuarios.mostrarUsuarios();
                                break;
                            case 4:
                                System.out.println("Bienvenido a Estadistica y reportes");
                                while (!regresar4) {
                                    System.out.println("1. Victorias");
                                    System.out.println("2. Derrotas");
                                    System.out.println("3. Regresar al menu principal");

                                    opcion = leer.nextInt();

                                    switch (opcion) {
                                        case 1:
                                            System.out.println("\nLos jugadores que han ganado son:");
                                            System.out.println("---------------------------------\n");
                                            break;
                                        case 2:
                                            System.out.println("\nLos jugadores que han perdido son:");
                                            System.out.println("----------------------------------\n");
                                            break;
                                        case 3:
                                            regresar4 = true;
                                            break;
                                        default:
                                            System.out.println("La opcion seleccionda no esta disponible");
                                            break;
                                    }
                                }
                                break;
                            case -1:
                                salir = true;
                                break;
                            default:
                                System.out.println("la opcion no esta contemplada");
                                break;

                        }
                    }
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("\nLa opcion no esta contemplada");
                    break;

            }
        }
    }

    
}