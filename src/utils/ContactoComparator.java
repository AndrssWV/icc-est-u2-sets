package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {

    @Override
    public int compare(Contacto c1, Contacto c2) {
        int ra = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        return ra!=0? ra : c1.getNombre().compareToIgnoreCase(c2.getNombre());
    }
    

}
