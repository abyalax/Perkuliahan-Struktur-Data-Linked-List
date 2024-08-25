/**
 */
public class oldSingleLinkedList {

    //Head refer front of the list
    private Nodes head;
    //size of the SingleLinkedList
    private int size;

    // Inisialisasi single linked list tanpa parameter
    public oldSingleLinkedList() {
        head = new Nodes(0);
        size = 0;
    }

    //  init with specified head and size node
    // Inisialisasi dengan parameter head dan size
    public oldSingleLinkedList(Nodes head, int size) {
        this.head = head;       // the head node of the list
        this.size = size;       // the size of the list
    }

    // method insert element at the head
    //method untuk menambahkan elemen pada node Head (awal)
    public void insertHead(int x ) {
        insertN(x, 0); // x element to be added
    }
    //method untuk menambahkan elemen pada node Tail (akhir)
    public void insertTail(int data) {
        insertN(data, size); //  data element to be added
    }

    /**
     * Insert a new Node at a specified position
     * @param data         data to be stored in a new node
     * @param position     position at which a new node is to be inserted
     * 
     * Memasukkan Node baru pada posisi tertentu
     * parameter data adalah data yang akan disimpan pada node baru
     * parameter position adalah posisi dimana node baru akan disisipkan
     */

     //method inti untuk menambahkan elemen pada linked list
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

     public void deleteHead() {
        deleteN(0); // return The element deleted
     }

     public void deleteTail() {
        deleteN(size-1); // This method deletes an element at the tail
     }

     /*
      * This method deletes an element at specific position
      */
      public void deleteN(int position) {
        checkBounds(position, 0, size -1);
        Nodes cur = head;
        for(int i = 0; i < position; i++) {
            cur = cur.next;
        }

        Nodes destroy = cur.next;
        cur.next = cur.next;
        destroy = null;          
        size--;
      }

      /**
       * @param position to check position
       * @param low      low index
       * @param high     high index
       * @throws IndexOutOfBoundsException if {@code position} 
       *          not in range {@code low} to {@code high}
       * 
       * Check posisi indeks yang melebihi batas dari range 
       * ( index low - index high )
       * jika berada diluar rentang low-high maka IndexOutOfBounds akan dilempar 
       * jika tidak maka program dapat dilanjutkan
       */

      public void checkBounds(int position, int low, int high) {
        if(position > high || position < low) {
            throw new IndexOutOfBoundsException(position + "");
        }
      }

      /*
       * clear all nodes in List
       * menghapus semua list dan mengatur ulang node
       */
      public void clear() {
        if(size == 0) {
            return;
        }
        Nodes prev = head.next;
        Nodes cur = prev.next;
        while (cur != null) {
            prev = null;    // clear to let Garbage Collector do its
            prev = cur;
            cur = cur.next;
        }
        prev = null;
        head.next = null;
        size = 0;
      }

      // method untuk mengecek node isinya kososng atau tidak
      // method akan me return true jika isinya kosong
      public boolean isEmpty() {
        return size == 0;   //Checks if the list is empty ( true if its empty )
      }
      // method untuk mengecek size
      public int size() {
        return size;
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

      public static void main(String[] args) {
        oldSingleLinkedList myList = new oldSingleLinkedList();
        // assert adalah sintaks pengkondisian dimana pada kode ini
        // method isEmpty mereturn tipe data boolean
        // jika isEmpty me return true maka program akan berlanjt
        // jika false maka program akan melempar pengecualian ( assertion error ) 
        // perlu diingat untuk mengaktifkan sintaks assert harus enable assertion
        //berikut sintaks pada command line
        //java -ea SingleLinkedList.java
        assert myList.isEmpty();
        
        //input data dari depan
        myList.insertHead(11);
        myList.insertHead(3);
        myList.insertHead(90);
        myList.insertHead(6);
        myList.insertHead(33);
        System.out.println("\n" + myList + "\n");
        //end input data dari depan
        
        //DELETE HEAD
        // myList.deleteHead();
        // System.out.println(myList);
        
        //DELETE TAIL
        // myList.deleteTail();
        // System.out.println(myList);
        
        // INSERT IN THE MIDDLE LINKED (DATA, POSITION)
        // myList.insertN(72, 2);   // POSITION DIBACA DARI HEAD
        // System.out.println(myList);
        
        //DELETE SPESIFIC POSITION
        // myList.deleteN(1);
        // System.out.println(myList);

        // myList.clear();
        // System.out.println(myList);
        // assert myList.isEmpty();
        // System.out.println("myList = " + myList);
      }

      /**
       * Inisialisasi pembuatan Nodes
       */
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

}
