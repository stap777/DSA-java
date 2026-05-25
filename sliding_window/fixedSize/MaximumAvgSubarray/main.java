public class main {

    static double MAS(int [] nums, int k) {

        int windowSum = 0;

        for (int r = 0; r < nums.length; r++) {
            windowSum += nums[r];

        }

        int maxSum = windowSum;

        for (int r = k; r < nums.length; r++) {
            windowSum = windowSum - nums[r-k] + nums[r];
            maxSum = Math.max(maxSum, windowSum);
        }
        return (double) maxSum / k;
    }
}