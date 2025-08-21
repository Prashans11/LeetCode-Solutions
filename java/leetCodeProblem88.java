class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums1.length < n){
        return;
        }

        int i = m - 1;       
        int j = n - 1;       
        int k = m + n - 1;   

        for (; i >= 0 && j >= 0; k--) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
        }
        for (; j >= 0; j--, k--) {
            nums1[k] = nums2[j];
       }
    }
}
