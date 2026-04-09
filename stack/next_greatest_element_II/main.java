import java.util.ArrayDeque;

class main {
    static int [] NGEII(int [] arr) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        int [] result = new int [n];
        
        for (int i = 0; i < n * 2; i++) {
            int j = i % n;
            while (!stack.isEmpty() && arr[stack.peek()] < arr[j]) {
                int index = stack.pop();
                result[index] = arr[j];
            }
            if (i<n) {
                stack.push(j);
            }
            
        }
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }
        return result;
        
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,2,1};
        int [] res = NGEII(arr);
        for (int x : res) {
            System.out.println(x + "");
        }
        
    }
}