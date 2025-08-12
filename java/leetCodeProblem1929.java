// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int n = nums.length;
//         int[] ans = new int[n+n];

//         if(nums.length == 0){
//             return new int[0];
//         }

//         for(int i=0; i<n; i++){
//             ans[i] = nums[i];
//         }

//         for(int j = n; j<n+n; j++){
//             ans[j]= nums[j-n];
//         }
//         return ans;
//     }
// }

//-------time complexity- O(n)

//<---------------------------------------- More Optimized solution <----------------------------------------
//time complexity remains same i.e., O(n)
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n+n];

        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
