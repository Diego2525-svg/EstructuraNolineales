package main.Materia.Controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

    public Sets(){
        construirHashSet();
        construitLinkedHashSet();
        construirTreeSet();
        construirSetConCOmparador();
    }
//Los hash no permiten objetos duplicados
    public void construirHashSet(){
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Piña");
        conjunto.add("Uva");
        System.out.println("Hashset "+conjunto);

        //Eliminar un elemento
        conjunto.remove("Banana");
        System.out.println("Hash despues de eliminar Banana "+conjunto);

        //Verificar si un elemento existe contains
        boolean contieneNaranja= conjunto.contains("Naranja");
        System.out.println("Conjunto contiene naranja "+contieneNaranja);

        //Obtener el tamaño del conjunto
        int tamaño= conjunto.size();
        System.out.println("El tamaño del conjunto es "+tamaño );
    }
//Se imprimen en el mismo orden que son ingresados
    public void construitLinkedHashSet(){
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Piña");
        conjunto.add("Uva");
        System.out.println("LinkedHashset "+conjunto);

    }

    public void construirTreeSet(){
        TreeSet<String> conjunto = new TreeSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Piña");
        conjunto.add("Uva");
        System.out.println("LinkedHashset "+conjunto);
    }



    public void construirSetConCOmparador(){
        //Para personalizar como quiero que se ordene
        //Comprador personalizado que ordena las cadenas en el orden que querams
        Comparator<String> comparadorOrdenInverso = new Comparator<String>() {
            @Override
            public int compare(String s1,String s2){
                return s2.compareTo(s1);
            }
        };
        TreeSet<String> conjunto = new TreeSet<>(comparadorOrdenInverso);
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Piña");
        conjunto.add("Uva");
        System.out.println("LinkedHashset "+conjunto);
    }
}
