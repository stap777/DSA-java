class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class insertionAtEnd {
    
    static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

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

        head = insertAtEnd(head, 5);
        printList(head);
    }

}