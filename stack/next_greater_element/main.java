import java.util.ArrayDeque;

public class main {

    static int[] next_greatest(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i=0; i<n; i++) {

            while (!stack.isEmpty() && stack.peek() < arr[i]) {

                int index = stack.pop();
                result[index] = arr[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        return result;
    }

    public static void main(String[] args) {

        int [] arr = {1,2,4,3,7,5};

        int [] res = next_greatest(arr);

        for (int x : res) {
            System.err.println(x + "");
        }
    }
}