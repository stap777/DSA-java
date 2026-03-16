import java.util.ArrayDeque;

public class main {
    static int [] histrogram(int [] arr) {
        
        int n = arr.length;
        int [] area = new int [n];
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i<n; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                int Index = stack.pop();
                int width = i - Index;
                area[Index] = arr[Index] * width;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            int in = stack.pop();
            if (!stack.isEmpty()) {
                int wid = n - stack.peek() -1;
                area[in] = wid * arr[in];
            }
            else {
                area[in] = n * arr[in];
            }
        }
        return area;
        
    }

    public static void main(String [] args) {
        int [] arr = {3,4,6,8};

        int [] res = histrogram(arr);

        for (int x : res) {
            System.out.println(x + " "); 
        }
        
    }
}
// implement logic to get max value only 
