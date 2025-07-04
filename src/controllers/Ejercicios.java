package controllers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicios {
    public Ejercicios() {
        System.out.println("Ejercicio 1");
        System.out.println("{1,2,3,4,5} => " + tieneDupublicados(new int[] {1,2,3,4,5}));
        System.out.println( "{1,2,3,4,5,4,3,2} => " + tieneDupublicados(new int[] {1,2,3,4,5,4,3,2}));
        System.out.println();

        System.out.println("Ejercicio 2");
        System.out.println("Murcielago => " + esIsograma("murcielago"));
        System.out.println("Camaleon => " + esIsograma("camaleon"));
        System.out.println();

        System.out.println("Ejercicio 3");
        String texto1 = "La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía? Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente. En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.";
        System.out.println("Texto1 => " + contarPalabrasUnicas(texto1));
        String texto2 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        System.out.println("Texto2 => " + contarPalabrasUnicas(texto2));
        String texto3 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";
        System.out.println("Texto3 => " + contarPalabrasUnicas(texto2));
        System.out.println();

        compararTextos(texto2, texto3);
    }

    public boolean tieneDupublicados(int[] numeros) {
        Set<Integer> set = new HashSet<>();
        for (int n : numeros) {
            if (!set.add(n)) return true;
        } 
        return false;
    }

    public boolean esIsograma(String palabra) {
        Set<Character> set = new HashSet<>();
        for (char c : palabra.toCharArray()) {
            if (!set.add(c)) return false;
        } 
        return true;
    }

    public int contarPalabrasUnicas(String frase) {
        Set<String> set = new HashSet<>();
        for (String s : frase.split(" ")) set.add(s);
        return set.size();
    }

    public Set<String> obtenerPalabras(String frase) {
        Set<String> set = new HashSet<>();
        for (String s : frase.split(" ")) set.add(s);
        return set;
    }

    public void compararTextos(String t1, String t2) {
        Set<String> words1 = obtenerPalabras(t1);
        System.err.println("Texto 1: " + words1.size());
        Set<String> words2 = obtenerPalabras(t2);
        System.err.println("Texto 2: " + words2.size());
        Set<String> both = new HashSet<>(words1);
        both.retainAll(words2);
        Set<String> total = new HashSet<>();
        total.addAll(words1);
        total.addAll(words2);
        System.out.println("Cuantas palabras comunes: " + both.size());
        System.out.println("Coincidencia lexica: " + ((both.size()*100.0)/total.size())+"%");

        words1.removeAll(words2);
        words2.removeAll(words1);

        System.out.println("Solor texto 1: " + words1);
        System.out.println("Solor texto 2: " + words2);

    }
}
