import java.util.HashMap;
import java.util.Hashtable; // Importa a classe Hashtable 
import java.util.Map.Entry;
import java.util.TreeMap;

public class ExemploMap { // Declara a classe
    public static void main(String[] args) { // Método principal

        // Hashtable exemplo
        Hashtable<Integer, String> hashtable = new Hashtable<>(); // Cria um Hashtable
        hashtable.put(1, "Maçã"); // Entrada com chave 1 e valor maçã
        hashtable.put(2, "Banana"); // Entrada com chave 2 e valor Banana
        hashtable.put(3, "Laranja"); // Entrada com chave 3 e valor Laranja

        System.out.println("Hashtable:"); // Cabeçalho indicando a seção Hashtable
        for (Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue()); // Imprime a chave e o
                                                                                             // valor da Entrada
        }

        // HashMap exemplo
        HashMap<Integer, String> hashmap = new HashMap<>(); // Cria um HashMap
        hashmap.put(1, "Maçã"); // Entrada com chave 1 e valor Maçã
        hashmap.put(2, "Banana"); // Entrada com chave 2 e valor Banana
        hashmap.put(3, "Laranja"); // Entrada com chave 3 e valor Laranja
        hashmap.put(4, "Uva"); // Entrada com chave 4 e valor Uva
        hashmap.put(null, null); // Entrada com chave nula e valor nulo

        System.out.println("\nHashMap:"); // Imprime um cabeçalho indicando a seção HashMap.
        for (Entry<Integer, String> entry : hashmap.entrySet()) { // Itera sobre cada Entrada do HashMap.
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue()); // Imprime a chave e o
                                                                                             // valor da Entrada.
        }

        // TreeMap exemplo
        TreeMap<Integer, String> treemap = new TreeMap<>(); // Cria um TreeMap que mapeia Inteiros para Strings
        treemap.put(3, "Laranja"); // Entrada com chave 3 e valor Laranja
        treemap.put(2, "Banana"); // Entrada com chave 2 e valor Banana
        treemap.put(1, "Maçã"); // Entrada com chave 1 e valor Maçã
        treemap.put(4, "Uva"); // Entrada com chave 4 e valor Uva

        System.out.println("\nTreeMap (ordenado por chave):"); // Imprime um cabeçalho indicando a seção TreeMap
        for (Entry<Integer, String> entry : treemap.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue()); // Imprime a chave e o
                                                                                             // valor da Entrada
        }
    }
}
