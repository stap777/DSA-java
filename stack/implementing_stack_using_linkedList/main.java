
// implementing stack using a linkd list 


/* logic =  like what we use to do in array keep track of top we dont have to do that here as we already 
have head Node we just need to make sure we change head to head.next every time we pop
Push:
newNode.next = top
top = newNode
Pop:
value = top.data
top = top.next
Peek:
return top.data
isEmpty:
top == null
Notice how similar this is to array stack boundary logic.

 */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.next = null;
        this.data = data;
    }

}

class LLStack {

    Node top = null;

    void push(int value) {

        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        
        if (is_empty()) {
            System.out.println("list is empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    int peek() {

        if (is_empty()) {
            System.out.println("list is empty");
            return -1;
        }
        return top.data;
    }

    boolean is_empty() {
        return top == null;
    }

    void printstack() {
        Node current = top;

        System.out.println("stack: ");

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class main {

    public static void main(String[] args) {
        
        LLStack stack = new LLStack();

        System.out.println("empty? = " + stack.is_empty());

        System.out.println("popped " + stack.pop());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.printstack();

        System.out.println("popped " + stack.pop());

        System.out.println("empty? =  " + stack.is_empty());

        System.out.println("top value: " + stack.peek());
    }
}