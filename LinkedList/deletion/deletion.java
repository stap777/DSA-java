class Node {
    Node next;
    int data;

    Node(int data) {
        this.next = null;
        this.data = data;
    }
}

public class deletion {

    static Node delete(Node head, int value) {
        if (head == null) {
            return head;
        }

        if (head.data == value) {
            return head.next;
        }

        Node prev = null;
        Node current = head;

        while (current != null && current.data != value) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return head;
        }

        prev.next = current.next;

        return head;

    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);

        head = delete(head, 10);

        printList(head);

    }
}