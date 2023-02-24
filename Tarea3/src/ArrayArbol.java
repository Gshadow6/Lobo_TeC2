import java.util.ArrayList;

public class ArrayArbol {
    public static void main(String[] args) {
        ArrayList <Arbol> ArrayArbol = new ArrayList<>();

        Arbol Arbol1 = new Arbol("Abedul", "blanca");
        Arbol Arbol2 = new Arbol("Abeto", "Cafe oscura");
        ArrayArbol.add(Arbol1);
        ArrayArbol.add(1, Arbol2);
        ArrayArbol.add(2, new Arbol("Roble", "Cafe"));

        System.out.println(ArrayArbol);

    }
}