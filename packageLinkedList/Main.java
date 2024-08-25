package packageLinkedList;

public class Main {


    public static void main(String[] args) {
        System.out.println("ready boss");

        SingleLinkedList myLinkedList = new SingleLinkedList(null);
        Insert InsertNode = new Insert();
        // System.out.println(myLinkedList.head);

        InsertNode.insertHead(myLinkedList, 11); 
        InsertNode.insertHead(myLinkedList, 3);
        InsertNode.insertHead(myLinkedList, 90);
        // InsertNode.insertHead(myLinkedList, 6);
        // InsertNode.insertHead(myLinkedList, 33);
        // InsertNode.insertN(myLinkedList, 1, 0);
        // // System.out.println(myLinkedList.head.value);
        // InsertNode.insertN(myLinkedList, 2, 1);
        // InsertNode.insertN(myLinkedList, 3, 2);
        System.out.println("Linked List berisi ");
        myLinkedList.display();

        // System.out.println("Panjang elemen linked list = " + "\n");

        // InsertNode.insertHead(myLinkedList, 2);
        // myLinkedList.display();



    }
}
