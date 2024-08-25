package packageLinkedList;

public class Insert{

    //method untuk menambahkan elemen pada node Head (awal)
    public void insertHead(SingleLinkedList list, int data) {
        insertN(list, data, 0); // x element to be added
    }

    public void checkBounds(int position, int low, int high) {
        if(position > high || position < low) {
            throw new IndexOutOfBoundsException(position + "");
        }
    }

    public void insertN(SingleLinkedList listParam, int data, int position) {
        checkBounds(position, 0, listParam.size);
        Nodes newNode = new Nodes(data);
        if (listParam.head == null) {
            listParam.head = newNode;
        } else {
            Nodes current = listParam.head;
            while (current.next != null) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        listParam.size++;
        // System.out.println(listParam.size);
    }

    /**
     public void insertN(int data, int position) {
        checkBounds(position, 0, size);
        Nodes cur = head;
        for (int i = 0; i < position; ++i) {
            cur = cur.next;
        }
        Nodes nodes = new Nodes(data);
        nodes.next = cur.next;
        cur.next = nodes;
        size++;
     }

             if (listParam.head == null) {
            listParam.head = newNode;
        } else {
            Nodes current = listParam.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        listParam.size++;
     */
    
}
