class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
             for (int j = i + 1; j < nums.length; j++){
            if((nums[i] + nums[j]) == target){
                return new int[] { i, j };
            }
        }
        }
        return new int[] {};
    }
}

public class Main{
    public static void main(String[] args){
        Solution s= new Solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = s.twoSum(nums, target);
        System.out.println(""+ result[0] + "," + result[1]);
    }
}
