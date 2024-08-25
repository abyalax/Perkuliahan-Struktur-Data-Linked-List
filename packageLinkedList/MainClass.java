package packageLinkedList;

public class MainClass {
    public static void main(String[] args) {
        SingleLinkedList myLinkedList = new SingleLinkedList(null);
        Method method = new Method();
        method.insertHead(myLinkedList, 11);
        method.insertHead(myLinkedList, 3);
        method.insertHead(myLinkedList, 90);
        method.insertHead(myLinkedList, 6);
        method.insertHead(myLinkedList, 33);
        myLinkedList.display();
        System.out.println("deleteHead"); // 2
        method.deleteHead(myLinkedList);
        myLinkedList.display();

        System.out.println("deleteTail"); // 3
        method.deleteTail(myLinkedList);
        myLinkedList.display();

        System.out.println("insertN"); // 4
        method.insertN(myLinkedList, 72, (myLinkedList.size) - 2);
        myLinkedList.display();

        System.out.println("deleteN"); // 5
        method.deleteN(myLinkedList, 2);
        myLinkedList.display();
    }
}

/*
 * 
 * Method method = new Method();
 * method.insertHead(myLinkedList, 11);
 * method.insertHead(myLinkedList, 3);
 * method.insertHead(myLinkedList, 90);
 * method.insertHead(myLinkedList, 6);
 * method.insertHead(myLinkedList, 33);
 * System.out.println("Before");
 * myLinkedList.display();
 * method.deleteN(myLinkedList, 1);
 * System.out.println("After");
 * myLinkedList.display();
 * 
 */