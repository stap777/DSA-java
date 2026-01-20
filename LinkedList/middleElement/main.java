class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class main {
    
    static Node findMiddle(Node head) {
        if (head == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    static void printmi(Node head) {

        System.err.println(head.data);
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(05);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(20);
        head = findMiddle(head);  
        printmi(head);
    }

}