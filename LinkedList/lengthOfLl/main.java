class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class main {
    
    static void countLength(Node head) {
        Node current = head;
        int count = 0;
        while (current != null) {
            count ++;
            current = current.next;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(20);
        countLength(head);  
    }

}