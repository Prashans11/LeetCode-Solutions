class Solution {
    public int searchInsert(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        if(map.containsKey(target)){
            return map.get(target);
        }

        //if the target does not exist
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                return i;
            }
        }

        // If target is larger than all elements, insert at the end.
        return nums.length;
    }
}
