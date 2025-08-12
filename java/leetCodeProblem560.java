class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int res = 0;  
            for (int j = i; j < n; j++) {
                res += nums[j];  
                if (res == k) {
                    count++; 
                }
            }
        }
        return count;
    }
}

//time complexitty - O(n^2)

//use HashMap for O(n)
