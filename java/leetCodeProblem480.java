class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        
        double[] result = new double[nums.length - k + 1];
        
        for (int i = 0; i <= nums.length - k; i++) {
            int[] window = new int[k];
            for (int j = 0; j < k; j++) {
                window[j] = nums[i + j];
            }
            
            Arrays.sort(window);

            if (k % 2 == 1) {
                result[i] = window[k / 2];
            } else {
                result[i] = (window[k / 2 - 1] + window[k / 2]) / 2.0;
            }
        }
        return result; 
    }
}
