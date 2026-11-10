package model;

/**
 * Clase que hereda de Persona.
 * Representa a un trabajador de la agencia de turismo.
 */
public class Empleado extends Persona {
    private String cargo;

    public Empleado(String nombre, String rut, Direccion direccion, String cargo) {
        super(nombre, rut, direccion); // Llama al constructor de la clase base
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "[Empleado] " + super.toString() + " | Cargo: " + cargo;
    }
}