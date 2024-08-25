package DataPegawai;

class MultipleLinkedList {
    public Node head;
    public int size;

    public MultipleLinkedList() {
        this.head = new Node(null);
        this.size = 0;
    }
    public MultipleLinkedList(Node head) {
        this.head = head;
    }
    public void add(String namaPegawai) {
        Node newNode = new Node(namaPegawai);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    public void addSubList(Node parent, MultipleLinkedList subList) {
        parent.subList = subList;
    }

    public void addSubListAt(int index, MultipleLinkedList subList) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.subList = subList;
    }

    public boolean remove(String namaPegawai) {
        return removeRecursive(head, null, namaPegawai);
    }

    private boolean removeRecursive(Node node, Node parent, String namaPegawai) {
        if (node == null) {
            return false;
        }
        // If the node to be removed is the head
        if (node == head && namaPegawai != null && namaPegawai.equals(node.namaPegawai)) {
            head = head.next;
            return true;
        }
        Node current = node;
        Node previous = null;
        while (current != null) {
            if (current.namaPegawai != null && current.namaPegawai.equals(namaPegawai)) {
                // Remove current node
                if (previous != null) {
                    previous.next = current.next;
                } else {
                    if (parent != null) {
                        parent.subList.head = current.next;
                    }
                }
                // Remove the entire sublist if the current node has one
                if (current.subList != null) {
                    current.subList.head = null;
                }
                return true;
            }
            // Recursive call to remove from sublist
            if (current.subList != null && removeRecursive(current.subList.head, current, namaPegawai)) {
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }
    // Metode untuk mencari node berdasarkan nama pegawai dan mengembalikan referensi ke node tersebut
    public Node findNode(String namaPegawai) {
        return findNodeRecursive(head, namaPegawai);
    }
    private Node findNodeRecursive(Node node, String namaPegawai) {
        if (node == null) {
            return null;
        }
        if (namaPegawai != null && namaPegawai.equals(node.namaPegawai)) {
            return node;
        }
        Node foundInSubList = null;
        if (node.subList != null) {
            foundInSubList = findNodeRecursive(node.subList.head, namaPegawai);
        }
        return (foundInSubList != null) ? foundInSubList : findNodeRecursive(node.next, namaPegawai);
    }
    private void printIndent(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("   ");
        }
    }
    private void displayRecursive(Node node, int level) {
        boolean isFirst = true;
        while (node != null) {
            if (node.namaPegawai != null) {
                if (!isFirst) {
                    System.out.println();
                }
                printIndent(level);
                System.out.print("> " + node.namaPegawai);
                isFirst = false;
            }
            if (node.subList != null) {
                if (node.namaPegawai != null) {
                    System.out.print(", dan Teamnya: ");
                    System.out.println();
                }
                displayRecursive(node.subList.head, level + 1);
            }
            node = node.next;
        }
    }
    public void display() {
        displayRecursive(head, 0);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        toStringRecursive(builder, head, 0);
        return builder.toString();
    }
    private void toStringRecursive(StringBuilder builder, Node node, int level) {
        boolean isFirst = true;
        while (node != null) {
            if (node.namaPegawai != null) {
                if (!isFirst) {
                    builder.append("\n");
                }
                printIndent(builder, level);
                builder.append("> ").append(node.namaPegawai);
                isFirst = false;
            }
            if (node.subList != null) {
                if (node.namaPegawai != null) {
                    builder.append(", dan Teamnya:\n");
                }
                toStringRecursive(builder, node.subList.head, level + 1);
            }
            node = node.next;
        }
    }
    private void printIndent(StringBuilder builder, int level) {
        for (int i = 0; i < level; i++) {
            builder.append("    ");
        }
    }
}