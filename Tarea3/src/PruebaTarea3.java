import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PruebaTarea3 {
    public static void main(String[] args) {
        System.out.println("Tarea de Arbol");
        ArrayList <Arbol> ArrayArbol = new ArrayList<>();

        Arbol Arbol1 = new Arbol("Abedul", "blanca");
        Arbol Arbol2 = new Arbol("Abeto", "Cafe oscura");
        ArrayArbol.add(Arbol1);
        ArrayArbol.add(1, Arbol2);
        ArrayArbol.add(2, new Arbol("Roble", "Cafe"));
        System.out.println(ArrayArbol);

        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("Tarea de Teatro");

        HashMap<String,Asiento> Teatro = new HashMap<>();

        //Las filas se identifican desde A a J
        //Las columnas se identifican desde 1-8
        Teatro.put("A1",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("A2",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("A3",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("A4",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("A5",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("A6",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("A7",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("A8",new Asiento(10, "Vinilo", "Morado", true));

        Teatro.put("B1",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("B2",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("B3",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("B4",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("B5",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("B6",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("B7",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("B8",new Asiento(10, "Vinilo", "Morado", true));

        Teatro.put("C1",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("C2",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("C3",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("C4",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("C5",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("C6",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("C7",new Asiento(10, "Vinilo", "Morado", true));
        Teatro.put("C8",new Asiento(10, "Vinilo", "Morado", true));

        Teatro.put("D1",new Asiento(10, "Vinilo", "Azul Marino", true));
        Teatro.put("D2",new Asiento(10, "Vinilo", "Azul Marino", true));
        Teatro.put("D3",new Asiento(10, "Vinilo", "Azul Marino", true));
        Teatro.put("D4",new Asiento(10, "Vinilo", "Azul Marino", true));
        Teatro.put("D5",new Asiento(10, "Vinilo", "Azul Marino", true));
        Teatro.put("D6",new Asiento(10, "Vinilo", "Azul Marino", true));
        Teatro.put("D7",new Asiento(10, "Vinilo", "Azul Marino", true));
        Teatro.put("D8",new Asiento(10, "Vinilo", "Azul Marino", true));

        Teatro.put("E1",new Asiento(6, "Vinilo", "Azul Marino", true));
        Teatro.put("E3",new Asiento(6, "Vinilo", "Azul Marino", true));
        Teatro.put("E4",new Asiento(6, "Vinilo", "Azul Marino", true));
        Teatro.put("E5",new Asiento(6, "Vinilo", "Azul Marino", true));
        Teatro.put("E6",new Asiento(6, "Vinilo", "Azul Marino", true));
        Teatro.put("E7",new Asiento(6, "Vinilo", "Azul Marino", true));
        Teatro.put("E8",new Asiento(6, "Vinilo", "Azul Marino", true));

        Teatro.put("F1",new Asiento(6, "Vinilo", "Azul Marino", true));
        Teatro.put("F2",new Asiento(6, "Vinilo", "Azul Marino", true));
        Teatro.put("F3",new Asiento(6, "Vinilo", "Azul Marino", true));
        Teatro.put("F4",new Asiento(6, "Vinilo", "Azul Marino", true));
        Teatro.put("F5",new Asiento(6, "Vinilo", "Azul Marino", true));
        Teatro.put("F6",new Asiento(6, "Vinilo", "Azul Marino", true));
        Teatro.put("F7",new Asiento(6, "Vinilo", "Azul Marino", true));
        Teatro.put("F8",new Asiento(6, "Vinilo", "Azul Marino", true));

        Teatro.put("G1",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("G2",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("G3",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("G4",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("G5",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("G6",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("G7",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("G8",new Asiento(6, "Vinilo", "Azul Rey", true));

        Teatro.put("H1",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("H2",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("H3",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("H4",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("H5",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("H6",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("H7",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("H8",new Asiento(6, "Vinilo", "Azul Rey", true));

        Teatro.put("I1",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("I2",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("I3",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("I4",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("I5",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("I6",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("I7",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("I8",new Asiento(6, "Vinilo", "Azul Rey", true));

        Teatro.put("J1",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("J2",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("J3",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("J4",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("J5",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("J6",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("J7",new Asiento(6, "Vinilo", "Azul Rey", true));
        Teatro.put("J8",new Asiento(6, "Vinilo", "Azul Rey", true));

        for (String i : Teatro.keySet()){
            System.out.println("En la fila y columna: "+ i + " corresponde al "+Teatro.get(i));
        }
    }
}