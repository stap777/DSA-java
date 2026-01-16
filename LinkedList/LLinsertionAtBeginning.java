class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;

    }
}

public class LLinsertionAtBeginning {
    
    static Node Insertion(Node head, int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        return head;
    }

    static void printlist(Node head) {

        Node current = head;
        while (current != null) {
            System.err.println(current.data + " -> ");
            current = current.next;
        }
        System.err.println("null");
    }

    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);

    

        head = Insertion(head, 5);

        printlist(head);
    }
}

