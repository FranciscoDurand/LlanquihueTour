package app;

import model.Direccion;
import model.Empleado;

/**
 * Clase principal para ejecutar el sistema.
 * Crea instancias y las muestra por consola.
 */
public class Main {
  public static void main(String[] args) {
    // Creación de las direcciones (Composición)
    Direccion dir1 = new Direccion("Av. Los Lagos 123", "Llanquihue");
    Direccion dir2 = new Direccion("Calle del Volcán 456", "Puerto Varas");
    Direccion dir3 = new Direccion("Camino Ensenada 789", "Frutillar");

    // Creación de 3 instancias de Empleado (Herencia y Composición)
    Empleado emp1 = new Empleado("Juan Pérez", "12.345.678-9", dir1, "Guía Turístico");
    Empleado emp2 = new Empleado("María González", "9.876.543-2", dir2, "Coordinadora de Rutas");
    Empleado emp3 = new Empleado("Pedro Soto", "15.678.910-1", dir3, "Operador Logístico");

    // Mostrar por consola usando toString()
    System.out.println("--- Registro Llanquihue Tour ---");
    System.out.println(emp1.toString());
    System.out.println(emp2.toString());
    System.out.println(emp3.toString());
  }
}
