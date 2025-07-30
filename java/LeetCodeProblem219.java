class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        
            for(int i = 0; i < nums.length; i++){
                if (i > k) {
                window.remove(nums[i - k - 1]);
            }
                if(window.contains(nums[i])){
                    return true;
            }
        window.add(nums[i]);
            }
        return false;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = {1,2,3,1};
            int k=3;
            boolean result = s.containsNearbyDuplicate(arr, k);
        System.out.println("Output" + result);
    }
}
