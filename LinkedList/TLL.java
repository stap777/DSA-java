class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;

    }
}

public class TLL {
    public static void main(String[] args) {

        Node head = new Node(10);
        Node Second = new Node(20);
        Node Third = new Node(30);
        Node fourth = new Node(40);

        head.next = Second;
        head.next.next = Third;
        head.next.next.next = fourth;

        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }


}

