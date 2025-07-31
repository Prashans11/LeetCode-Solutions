class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double maxSum = 0;
        
        // if(nums.length == 1){
        //     return nums[0];
        // }

        for(int i=0; i < k ; i++){
            maxSum += nums[i];
        }
        double windowSum = maxSum; 

        for(int i = k ; i < nums.length; i++){
            windowSum = windowSum + nums[i] - nums[i - k];
            maxSum =  Math.max(maxSum, windowSum);
        }
        return maxSum/k;
    }
}
