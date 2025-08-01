import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        //using Boyer-Moore Voting Algorithm
        for (int num : nums) {
            if (count == 0) {
                candidate = num; 
            }
            count += (num == candidate) ? 1 : -1;
        }       
        return candidate;
    }
}
