package src.principal;

import java.util.Scanner;

import src.tablero.*;
import src.usuarios.*;

public class Main {
    public static void main(String[] args) {

        Main thunder = new Main();

        /*t.pintarTablero();
        System.out.println(t.moverFicha(0, 0, 5, 5));
        t.pintarTablero();
        System.out.println(t.moverFicha(5, 5, 1, 1));
        t.pintarTablero();
        */
        /*
         * Celda t = new Celda(true); t.setFicha(new Ficha(true));
         * System.out.println(t.pintarCelda(0)); System.out.println(t.pintarCelda(1));
         * System.out.println(t.pintarCelda(2));
         */
    }
    
    static Scanner leer = new Scanner(System.in);
    private VectorUsuarios tablaUsuarios = new VectorUsuarios();
    private Tablero t = new Tablero(8, 8, true);

    public Main(){

        boolean salir = false;
        boolean regresar1 = false;
        boolean regresar3 = false;

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
                                System.out.println("");
                                System.out.println("¿Quienes van a jugar?");
                                System.out.println("");
                                while (!regresar1) {
                                    System.out.println("1. " );
                                    System.out.println("2. " );
                                    System.out.println("3. " );
                                    System.out.println("4. " );
                                    System.out.println("5. " );
                                    System.out.println("6. " );
                                    System.out.println("7. " );
                                    System.out.println("8. " );
                                    System.out.println("9. " );
                                    System.out.println("10. " );
                                    System.out.println("11. regresar al menu principal");
                                    opcion = leer.nextInt();
                                                         
                                    switch (opcion) {
                                        case 1:
                                            t.pintarTablero();
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                            break;
                                        case 6:
                                            break;
                                        case 7:
                                            break;
                                        case 8:
                                            break;
                                        case 9:
                                            break;
                                        case 10:
                                            break;        
                                        case 11:
                                            regresar1 = true;
                                            break;
                                        default:
                                            System.out.println("La opcion selecionada no esta disponible");
                                            break;
                                    }

                                }
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
                                while (!regresar3) {
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
                                            regresar3 = true;
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