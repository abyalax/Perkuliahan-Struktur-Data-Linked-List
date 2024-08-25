package DataPegawai;

public class Node {
    public String namaPegawai;
    public Node next;
    public MultipleLinkedList subList;

    public Node(String namaPegawai) {
        this.namaPegawai = namaPegawai;
        this.next = null;
        this.subList = null;
    }
}

