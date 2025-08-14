// class Solution {
//     public int removeDuplicates(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         int n = nums.length;
//         for(int i = 0; i < n; i++){
//             set.add(nums[i]);
//         }
//         int size = set.size();
//         int index = 0;
//         for (int num : set) {
//             nums[index++] = num;
//         }
//         while (index < n) {
//             nums[index++] = -1; 
//         }
//         return size;
//     }
// }
//
//The will not work for -ve integers
// 
//for both + & - integers
class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> seen = new LinkedHashSet<>();
        for (int x : nums) seen.add(x);

        int k = 0;
        for (int x : seen) nums[k++] = x;
        // Don’t fill the rest with any sentinel; just return k.
        return k;
    }
}
