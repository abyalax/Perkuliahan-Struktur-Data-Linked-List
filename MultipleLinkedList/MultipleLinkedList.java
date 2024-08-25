package MultipleLinkedList;

class MultipleLinkedList {
    public MultiNode head;
    public int size;

    
    public MultipleLinkedList() {
        this.head = new MultiNode(null);
        this.size = 0;
    }

    public MultipleLinkedList(MultiNode head ) {
        this.head = head;
    }

    public MultipleLinkedList(MultiNode head, int size) {
        this.head = head;
        this.size = size;
    }

    public void add(int value) {
        MultiNode newNode = new MultiNode(value);
        if (head == null) {
            head = newNode;
        } else {
            MultiNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void addSubList(MultiNode parent, MultipleLinkedList subList) {
        parent.subList = subList;
    }

    public void addSubListAt(int index, MultipleLinkedList subList) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        MultiNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.subList = subList;
    }
    
    private void printIndent(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
    }
    
    private void displayRecursive(MultiNode node, int level) {
        while (node != null) {
            printIndent(level);
            System.out.print("Parent: " + node.value);
            if (node.subList != null) {
                System.out.print(" Sublist: ");
                displayRecursive(node.subList.head, level + 1);
            }
            System.out.println();
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

    private void toStringRecursive(StringBuilder builder, MultiNode node, int level) {
        while (node != null) {
            printIndent(builder, level);
            builder.append("Parent: ").append(node.value).append(" -> ");
            if (node.subList != null) {
                builder.append(" Sublist: ");
                toStringRecursive(builder, node.subList.head, level + 1);
            }
            builder.append("\n");
            node = node.next;
        }
    }

    private void printIndent(StringBuilder builder, int level) {
        for (int i = 0; i < level; i++) {
            builder.append("    ");
        }
    }
    
}
