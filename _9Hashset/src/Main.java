import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> lista = new HashSet<>();
        //Scrivere una funzione che restituisca un hashset riempito
        add(lista, 3, 4, 5, 3);
        System.out.println(lista);

        //Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
        Integer x = 5;

        //Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
        Iterator<Integer> iterator= lista.iterator();
        while (iterator.hasNext()){
            if (x == iterator.next()){
                iterator.remove();
            }
        }
        System.out.println(lista);

        //Svuotare l'hashset, verificarlo e stampare il risultato
        lista.clear();
        System.out.println(lista);
        System.out.println("La lista è vuota? " + lista.isEmpty());
    }

    static void add(Set list, int a, int b, int c, int d) {
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
    }
}