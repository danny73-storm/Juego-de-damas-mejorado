package src.usuarios;

import src.principal.*;

public class VectorUsuarios{

    private Usuarios[] usuariost = new Usuarios[10];
    private int siguienteCodigo;

    public VectorUsuarios() {
        siguienteCodigo = 1;
    }

    // ingresar jugadores
    public void agregarUsuarios() {
        for (int i = 0; i < 2; i++) {
            String nombre = IngresoDatos.getTexto("Ingrese el nombre del jugador: ");
            int years = IngresoDatos.getEntero("Ingrese cuantos años tiene: ", false);
            agregarUsuarios(nombre, years);
            System.out.println();
        }
    }

    public void agregarUsuarios(String nombre, int years) {
        if (siguienteCodigo > 10) {
            System.out.println("Límite de jugadores ");
        } else {
            usuariost[(siguienteCodigo - 1)] = new Usuarios(siguienteCodigo, nombre, years);
        }
        siguienteCodigo++;
    }
    // fin ingresar jugadores

    public void mostrarUsuarios() {

        for (int i = 0; i < (siguienteCodigo - 1); i++) {
            System.out.println("-" + i + ") " + usuariost[i].getInformacion());
            // System.out.println("-"+i+") "+Jugadores[i].getId() + " nombre
            // "+Jugadores[i].getNombre()+ " year "+Jugadores[i].getYears());

        }
        System.out.println("\n\n");
    }

}
