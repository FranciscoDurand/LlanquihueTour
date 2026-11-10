package model;

/**
 * Clase base que representa a una persona en el sistema.
 * Aplica composición al incluir un objeto de la clase Direccion.
 */
public class Persona {
    private String nombre;
    private String rut;
    private Direccion direccion; // Relación de Composición

    public Persona(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | RUT: " + rut + " | Dirección: " + direccion.toString();
    }
}