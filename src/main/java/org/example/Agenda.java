package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase que representa una agenda de contactos.
 * Permite agregar, eliminar y modificar contactos.
 */
public class Agenda {
    private final List<Contacto> contacts; // Lista de Contacto

    /**
     * Constructor de la agenda.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Agrega un contacto a la agenda.
     *
     * @param name  Nombre del contacto.
     * @param phone Número de tlf del contacto.
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina un contacto de la agenda.
     *
     * @param name Nombre del contacto que elimina.
     */
    public void removeContact(String name) {
        contacts.removeIf(c -> c.getName().equalsIgnoreCase(name));
    }

    /**
     * Modifica el número de tlf de un contacto existente.
     *
     * @param name      Nombre del contacto.
     * @param oldPhone  Número de tlf actual.
     * @param newPhone  Nuevo número de tlf.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();
                int index = phones.indexOf(oldPhone);
                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Obtiene la lista de contactos.
     *
     * @return Lista de contactos.
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}
