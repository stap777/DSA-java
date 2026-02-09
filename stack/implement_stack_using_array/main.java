public class main {
    int[] stack;
    int top;
    int capacity;

    main(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    void push(int value) {
        
        if (is_full()) {
            System.err.println("stack overflowed");
            return;
        }
        top++;
        stack[top] = value;

    }

    int pop() {

        if (is_Empty()) {
            System.err.println("stack empty");
            return -1;
        }

        int value = stack[top];
        top--;
        return value;

        
    }
    
    int peek() {

         if (is_Empty()) {
            System.err.println("stack empty");
        }
        
        return stack[top];
    }

    boolean is_Empty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    boolean is_full() {
        if (top == capacity - 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        main s = new main(5);

        s.push(1);
        s.push(2);
        
        System.out.println("Top element: " + s.peek());

        System.out.println("Popped: " + s.pop());

        System.out.println("Top element after pop: " + s.peek());

        System.out.println("Is empty? " + s.is_Empty());
    }
}