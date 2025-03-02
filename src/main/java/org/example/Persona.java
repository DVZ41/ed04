package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un contacto en la agenda.
 */
public class Persona {
    private  String name;
    private  List<String> phones;

    /**
     * Constructor del contacto.
     *
     * @param name  Nombre del contacto.
     * @param phone Número de tlf principal.
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return Nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Establece un nuevo nombre para el contacto.
     *
     * @param name Nuevo nombre del contacto.
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Obtiene la lista de tlfs del contacto.
     *
     * @return Lista de números de tlf.
     */
    public List<String> getPhones() {
        return this.phones;
    }

    /**
     * Establece una nueva lista de teléfonos para el contacto.
     *
     * @param phones Nueva lista de teléfonos.
     */
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
