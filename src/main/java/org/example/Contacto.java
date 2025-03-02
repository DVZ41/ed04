package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un contacto en la agenda.
 */
public class Contacto {
    private final String name;
    private final List<String> phones;

    /**
     * Constructor del contacto.
     *
     * @param name  Nombre del contacto.
     * @param phone Número de tlf principal.
     */
    public Contacto(String name, String phone) {
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
     * Obtiene la lista de tlfs del contacto.
     *
     * @return Lista de números de tlf.
     */
    public List<String> getPhones() {
        return this.phones;
    }
}
