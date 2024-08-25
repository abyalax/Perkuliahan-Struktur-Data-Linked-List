package MethodLinkedList;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        LinkedList dataLinkedList = new LinkedList<>();

        dataLinkedList.add("satu");
        dataLinkedList.add("dua");
        dataLinkedList.add("tiga");
        dataLinkedList.add("empat");
        dataLinkedList.add("lima");

    // ? BASIC METHOD UNTUK LINKED LIST BAWAAN JAVA

        String ambilDataPertama = (String)dataLinkedList.poll();  // Mereturn elemen pertama ( head ) pada Linked list dan menghapusnya dari linked list
        // System.out.println(ambilDataPertama);
        
        String ambilDataTerakhir = (String)dataLinkedList.pollLast();  // Mereturn elemen terakhir ( tail ) pada Linked list dan menghapusnya dari linked list
        // System.out.println(ambilDataTerakhir);
        
        dataLinkedList.getFirst(); // Mereturn elemen pertama ( head ) pada Linked list tanpa menghapusnya
        dataLinkedList.getLast(); // Mereturn elemen terakhir ( tail ) pada Linked list tanpa menghapusnya

        // System.out.println(dataLinkedList);
        
        dataLinkedList.addFirst("dua");  // Menambahkan elemen di awal
        dataLinkedList.addLast("tiga"); // Menambahkan elemen di akhir

        // System.out.println(dataLinkedList); 

        dataLinkedList.add(1, "sisipan"); // Menambahkan elemen di posisi yang ditentukan

        // System.out.println(dataLinkedList);

        dataLinkedList.remove(); // Menghapus elemen pertama ( head ) pada Linked list
        dataLinkedList.removeLast(); // Menghapus elemen terakhir ( tail ) pada Linked list

        // System.out.println(dataLinkedList);

        dataLinkedList.peek(); // Mereturn elemen pertama ( head ) pada Linked list tanpa menghapusnya
        dataLinkedList.peekLast(); // Mereturn elemen terakhir ( tail ) pada Linked list tanpa menghapusnya

        // System.out.println(dataLinkedList);


        /**
         * ? ERROR HANDLING 
         */

        LinkedList dataLinkedListKedua = new LinkedList();
        // Pada method getFirst atau getLast jika linked list kosong maka akan terjadi error sehingga dibutuhkan try catch untuk menghandle error
        // berbeda dengan method peek dan peekLast ini akan mengembalikan null jika linked list kosong.
        try {
            dataLinkedListKedua.getFirst();
        } catch (NoSuchElementException e) {
            System.out.println("Linked List masih kosong, silahkan isi terlebih dahulu");
        }

        /**
        * ? TIPE GENERIK
         */

        //*Linked List Generic dengan parameterisasi untuk meningkatkan keamanan type */
        LinkedList<String> dataLinkedListTiga = new LinkedList<>();

        dataLinkedListTiga.add("satu");
        dataLinkedListTiga.add("dua");
        dataLinkedListTiga.add("tiga");

        LinkedList<Integer> dataLinkedListEmpat = new LinkedList<>();

        dataLinkedListEmpat.add(0, 0);
        dataLinkedListEmpat.add(1, 1);
        
        Integer dataHead = (Integer)dataLinkedListEmpat.poll();
        System.out.println(dataHead);

        //*Linked List Generic tanpa parameter */
        LinkedList LinkedListRaw = new LinkedList<>();

        LinkedListRaw.add("satu");
        LinkedListRaw.add("dua");
    }
}