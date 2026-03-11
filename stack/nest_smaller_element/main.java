import java.util.ArrayDeque;

public class main {
    
    static int [] smaller(int [] arr) {
        
        int n = arr.length;
        int [] result = new int[n];

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i<n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int Index = stack.pop();
                result[Index] = i - Index;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
                result[stack.pop()] = -1;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {73, 74, 75, 71, 69, 72, 76, 73};

        int [] res = smaller(arr);

        for (int x : res) {
            System.err.println(x + "");
        }
    }
}