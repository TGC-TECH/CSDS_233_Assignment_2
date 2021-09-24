//import java.util.LinkedList;

public class LLreverse {
    private Node head;
    private int length = 0;


    private class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int data() {
            return data;
        }

        public Node next() {
            return next;
        }
    }

    public LLreverse(int i) {
        Node head = new Node(i);
        this.head = head;

    }

    public void add(int i) {
        Node toadd = new Node(i);
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                current.next = toadd;
                length++;
                break;
            }
            current = current.next;

        } }

    public int size(){
        return length;
    }

    public int get(int i){ //returns element i
        if(i>length) { throw new java.util.NoSuchElementException(); //throws an error when the element does not exist
        }
        Node toreturn = head;
        for(int x = 0; x < i; x++) {
            toreturn = toreturn.next();
        }
        return  toreturn.data();
    }


    public void reverse() {
        Node node = head;
        Node previous = null, current = null;

        while (node != null) {
            current = node;
            node = node.next;

            // reverse the pointers
            current.next = previous;
            previous = current;
            head = current;
        }

        }

        public String toString(){
        String toretun = "[ ";
        Node current = head;
        while(current != null){
            toretun = toretun  + current.data() + ", ";
            current = current.next();
        }
        toretun = toretun + " ]";
        return toretun;
    }
}










