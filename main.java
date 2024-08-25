/**
 * main
 */
public class main {

    public static void main(String[] args) {
        System.out.println("ready");

        main myList = new main();

        // myList.insertHead(2);
        myList.insertN(3, 1);
        myList.insertN(4, 2);
        myList.insertN(6, 3);
        // myList.insertN(7, 4);
        // myList.insertN(8, 5);
        // myList.insertN(2, 2);
        // myList.insertN(3, 3);
        System.out.println(myList);
    }


    // CONSTRUCTOR

    //Head refer front of the list
    private Nodes head;
    //size of the SingleLinkedList
    private int size;

    // Inisialisasi single linked list tanpa parameter
    public main() {
        head = new Nodes();
        size = 0;
    }

    // public void insertHead(int x ) {
    //     insertN(x, 0); // x element to be added
    // }

    //METHOD OPERASI LINKED LIST
    //method inti untuk menambahkan elemen pada linked list
    public void insertN(int data, int position) {
        if (head == null) {
            insertHead(data);
        } else {
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
    }

    public void insertHead(int data) {
        Nodes newNode = new Nodes(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void checkBounds(int position, int low, int high) {
        if(position > high || position < low) {
            throw new IndexOutOfBoundsException(position + "");
        }
    }

    public int size() {
        return size;
      }

    public main(Nodes head) {
        this.head = head;
    }

    //  init with specified head and size node
    // Inisialisasi dengan parameter head dan size
    public main(Nodes head, int size) {
        this.head = null;       // the head node of the list
        this.size = 0;       // the size of the list
    }


    class Nodes {
      
        // The Value of the node
        int value;

        //point to the next node
        Nodes next;

        Nodes() {

        }
        /*
         * Constructor
         * 
         * @parameter value to be put in the node
         */
        Nodes(int value) {
            this(value,null);
        }
        Nodes(int value, Nodes next) {
            this.value = value;
            this.next = next;
        }
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