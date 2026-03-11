import java.util.ArrayDeque;

public class main {

    static int [] temp(int [] arr) {

        int n = arr.length;
        int [] output = new int [n];

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i=0; i<n;i++) {    
            
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int index = stack.pop();
                output[index] =  i - index;
            } 
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            output[stack.pop()] = 0;
        }
        
        return output;
    }

    public static void main(String [] args) {

        int [] arr = {73,74,75,71,69,72,76,73};

        int [] result = temp(arr);

        for (int x : result) {
            System.out.println(x + "");
        }
    }
}