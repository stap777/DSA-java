import java.util.ArrayDeque;

public class main {

    static int [] stockSpan(int[] arr) {
        int n = arr.length;
        int [] result = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i=0; i<n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = i + 1;
            }
            else {
                result[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        
        int [] arr = {2,4,6,2,4,2,7};
        int [] res = stockSpan(arr);
        
        for (int x : res) {
            System.out.println(x + "");
        }
    }
}