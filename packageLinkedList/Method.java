package packageLinkedList;

public class Method {
    // method untuk menambahkan elemen pada node Head (awal)
    public void insertHead(SingleLinkedList list, int data) {
        insertN(list, data, 0);
    }

    public void checkBounds(int position, int low, int high) {
        if (position > high || position < low) {
            throw new IndexOutOfBoundsException(position + "");
        }
    }
    public void insertN(SingleLinkedList listParam, int data, int position) {
        checkBounds(position, 0, listParam.size);
        Nodes newNode = new Nodes(data);

        if (position == 0) {
            newNode.next = listParam.head;
            listParam.head = newNode;
            listParam.size++;
        } else {
            Nodes current = listParam.head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            listParam.size++;
        }
    }
    
    public void removeHead(SingleLinkedList listParam) {
        deleteN(listParam, 0);
    }
    public void deleteTail(SingleLinkedList listParam) {
        deleteN(listParam, listParam.size-1);
    }
    public void deleteN(SingleLinkedList listParam, int position) {
        checkBounds(position, 0, listParam.size);
        if (position == 0) {
            Nodes removed = listParam.head;
            listParam.head = removed.next;
            removed = null;
        } else {
            Nodes pointer = listParam.head;
            for (var i = 0; i < position-1; i++) {
                pointer = pointer.next;
            }
            Nodes removed = pointer.next;
            pointer.next = removed.next;
            removed = null;
        }
        listParam.size--;
    }
    public void deleteHead(SingleLinkedList listParam) {
        Nodes removed = listParam.head;
        listParam.head = removed.next;
        removed = null;
        listParam.size--;
    }
}
