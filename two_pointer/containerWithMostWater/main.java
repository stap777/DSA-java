public class main {

    public static int mostWater(int [] arr) {

        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int maxArea = 0;
        
        while (l <  r) {

            int h = Math.min(arr[l], arr[r]);
            int w = r - l;

            maxArea = Math.max(maxArea, w * h);

            if (arr[l] < arr[r]) {
                l++;
            }
            else {
                r--;
            }

        }
        return maxArea;
    }

    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(arr));
    }
}