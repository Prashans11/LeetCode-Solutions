class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        
        // for(int i=0 ; i < nums.length; i++){
        //     for(int j= i+1; j < nums.length && j <= i+indexDiff ; j++){
        //         if(Math.abs((long)nums[i] - (long)nums[j]) <= valueDiff)
        //             return true;
        //     }
        // }
        // return false;

        
        // more optimized solution
        
        if (valueDiff < 0) return false;
        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            Long floor = set.floor((long) nums[i] + valueDiff);
            Long ceil = set.ceiling((long) nums[i] - valueDiff);

            if ((floor != null && floor >= nums[i]) || (ceil != null && ceil <= nums[i])) {
                return true;
            }
            set.add((long) nums[i]);
            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }
        return false;
    }
}
