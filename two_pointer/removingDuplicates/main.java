public class main {

    public static int RD(int [] arr) {

        int s = 0;
        int f = 1;

        while (f < arr.length) {

            if (arr[s] != arr[f]) {
                s++;
                arr[s] = arr[f];
            }
            f++;
        }
        return s + 1;
    }

    public static void main(String[] args) {
        int [] arr = {0,1,1,3};

        System.out.println(RD(arr));
    }
}