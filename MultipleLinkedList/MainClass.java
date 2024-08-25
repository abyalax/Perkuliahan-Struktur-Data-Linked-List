package MultipleLinkedList;

class MainClass {

    public static void main(String[] args) {
        MultipleLinkedList mainList = new MultipleLinkedList();
        mainList.add(1);
        mainList.add(2);
        mainList.add(3);
        mainList.add(4);
        mainList.add(5);
        mainList.add(6);

        MultipleLinkedList subList1 = new MultipleLinkedList();
        subList1.add(1);
        subList1.add(2);
        subList1.add(3);

        MultipleLinkedList subList2 = new MultipleLinkedList();
        subList2.add(1);
        subList2.add(2);
        subList2.add(3);

        MultipleLinkedList subList3 = new MultipleLinkedList();
        subList3.add(1);
        subList3.add(2);
        subList3.add(3);

        // mainList.addSubList(mainList.head.next, subList1);  // Adding sublist to node with value 2
        // mainList.addSubList(mainList.head.next.next, subList2);  // Adding sublist to node with value 3
        // mainList.addSubList(mainList.head.next.next.next, subList3);

        mainList.addSubListAt(1, subList1);
        mainList.addSubListAt(2, subList2);
        mainList.addSubListAt(3, subList3);

        MultipleLinkedList subList4 = new MultipleLinkedList();
        subList4.add(1);
        subList4.add(2);
        subList4.add(3);

        subList1.addSubListAt(1, subList4);

        
        System.out.println("Data Multiple Linked List :");
        mainList.display();
    }
}
