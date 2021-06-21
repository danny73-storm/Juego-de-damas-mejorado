package src.usuarios;

public class Usuarios {
    private int id;
    private String nombre;
    private int years;

    public Usuarios(int id, String nombre, int years){
        this.id = id;
        this.nombre = nombre;
        this.years = years;
    }

    public Usuarios(int id, String nombre){
        this(id, nombre, 0);
    }

    // getters y setters

    public int getId() {
        return id;
    }

    public int getYears() {
        return years;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setYears(int years) {
        this.years = years;
    }

    // fin getters y setters

    public String getInformacion() {
        String resultado = "Id: " + id + " Nombre del jugador: " + nombre;
        return resultado;
    }
}
