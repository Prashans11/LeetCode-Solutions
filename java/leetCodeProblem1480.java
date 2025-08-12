class Solution {
    public int[] runningSum(int[] nums) {

        int n = nums.length ;
        int windowSum = 0;
        int[] arr =new int[n];
        
        if(nums.length == 0){
            return new int[0];
        }
        for(int i=0; i<n; i++){
            windowSum += nums[i];
            arr[i] = windowSum;
        }
        return arr;
    }
}
