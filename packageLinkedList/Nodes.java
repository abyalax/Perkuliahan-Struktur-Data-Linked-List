package packageLinkedList;

public class Nodes {
    public Object value = null;
    Nodes next;

    Nodes() {

    };


    Nodes(Object value) {
        this(value, null);
    }

    Nodes(Object value, Nodes Next) {
        this.value = value;
    }
}
 