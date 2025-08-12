class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

//here left array will take product of all the element on to the left side of curr element
//like for first element there is no element left to it so we will take it as 1.
        left[0] = 1;
        for(int i = 1; i < n ; i++){
            left[i] = left[i-1] * nums[i-1]; 
        }

//and right will take product of all the element coming onto right side of curr element
//and there is no element post index [n-1] so will take it as 1
        right[n-1] = 1;
        for(int i = n-2 ; i >=0 ; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        for(int i=0 ; i< n ; i++){
            result[i] = left[i]*right[i];
        }
        return result;
    }
}
//worst case time complexity = O(n)
