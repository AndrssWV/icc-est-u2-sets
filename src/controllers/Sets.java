package controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.print.DocFlavor.STRING;

public class Sets {
    public Sets() {

    }

    public Set<String> construirHashSet() {
        Set<String> palabras = new HashSet<>(); 
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");

        return palabras;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> palabras = new LinkedHashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");

        return palabras;
    }

    public Set<String> construirTreeSet() {
        Set<String> palabras = new TreeSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");

        return palabras;
    }

    public Set<String> construirTreeSetConComparador() {
        Comparator<String> comparator = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                 int n = Integer.compare(s1.length(), s2.length());
                 if (n==0) return s1.compareTo(s2);
                 return n;
            }
        };

        Set<String> palabras = new TreeSet<>(comparator);
        
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        palabras.add("Celulas");

        return palabras;
    }

    public Set<String> construirTreeSetConComparadorPer() {
        Comparator<String> comparator = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                 int n = Integer.compare(s2.length(), s1.length());
                 if (n==0) return s2.compareTo(s1);
                 return n;
            }
        };

        Set<String> palabras = new TreeSet<>(comparator);
        
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        palabras.add("Celulas");

        return palabras;
    }
} 