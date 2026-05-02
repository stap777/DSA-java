import java.util.ArrayDeque;

public class main {

    static int TRW(int [] arr) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        int n = arr.length;
        int area = 0;

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && arr[i] > arr[stack.peek()] ) {
            
                int bottom = stack.pop();
            
                if (stack.isEmpty()) break;

                int left = stack.peek();

                int w = i - left - 1;
            
                int h = Math.min(arr[left], arr[i]) - arr[bottom];

                area += w * h;
            }

            stack.push(i);
        }

        return area;
    }

    public static void main(String[] args) {
        int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(TRW(arr));
    }
}