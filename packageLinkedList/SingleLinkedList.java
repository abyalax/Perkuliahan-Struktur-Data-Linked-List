package packageLinkedList;
class SingleLinkedList {
    public Nodes head;
    public int size;

    // public static void main(String[] args) {
    //     Nodes head = new Nodes(1);
    //     System.out.println("Nodes head isinya " + head.value);
    // }
    
    public SingleLinkedList() {
        this.head = new Nodes(null);
        // this.size = 0;
        // System.out.println(head);
    }

    public SingleLinkedList(Nodes head ) {
        this.head = head;
    }

    public SingleLinkedList(Nodes head, int size) {
        this.head = head;
        this.size = size;
    }

    public void display() {
        Nodes current = head;
        // int count;
        while ( current != null ) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("");
    }

    @Override
    public String toString() {
      if( size == 0 ) {
          return "";
      }
      StringBuilder builder = new StringBuilder();
      Nodes cur = head.next;
      while (cur != null) {
          builder.append(cur.value).append(" -> ");
          cur = cur.next;
      }
      return builder.replace(builder.length() - 2, builder.length(), "").toString();

    }

}
