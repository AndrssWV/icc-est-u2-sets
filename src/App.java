import java.util.Set;

import controllers.ContactoController;
import controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Sets sets = new Sets();
        //runHasHashSet(sets);
        //System.out.println();
        //runHasLinkedHashSet(sets);
        //System.out.println();
        //runTreeSet(sets);
        //System.out.println();
        //runTreeSetComparator(sets);
        //System.out.println();
        //runTreeSetComparatorPer(sets);

        ContactoController cc = new ContactoController();
    }

    public static void runHasHashSet(Sets sets) {
        System.out.println("HashSet");
        Set<String> palabras = sets.construirHashSet();
        for (String p : palabras) System.out.println(p);
    }

    public static void runHasLinkedHashSet(Sets sets) {
        System.out.println("LinkedHashSet");
        Set<String> palabras = sets.construirLinkedHashSet();
        for (String p : palabras) System.out.println(p);
    }

    public static void runTreeSet(Sets sets) {
        System.out.println("TreeSet");
        Set<String> palabras = sets.construirTreeSet();
        for (String p : palabras) System.out.println(p);
    }

    public static void runTreeSetComparator(Sets sets) {
        System.out.println("TreeSetComparator");
        Set<String> palabras = sets.construirTreeSetConComparador();
        for (String p : palabras) System.out.println(p);
    }

    public static void runTreeSetComparatorPer(Sets sets) {
        System.out.println("TreeSetComparator");
        Set<String> palabras = sets.construirTreeSetConComparadorPer();
        for (String p : palabras) System.out.println(p);
    }
}