package controllers;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorHash;
import utils.ContactoComparatorTelefono;

public class ContactoController {
    public ContactoController() {
        runTreeContacto();
        System.out.println();
        runTreeContactoNumeros();
        System.out.println();
        runTreeContactoHash();
    }

    public void runTreeContacto() {
        System.out.println("Comparator Apellido-Nombre");
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        for (Contacto c : agenda) System.out.println(c);
    }

    public void runTreeContactoNumeros() {
        System.out.println("Comparator Telefono");
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorTelefono());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        for (Contacto c : agenda) System.out.println(c);
    }

    public void runTreeContactoHash() {
        System.out.println("Comparator HashCode");
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorHash());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        for (Contacto c : agenda) System.out.println(c + " --> " + c.hashCode());
    }
}
