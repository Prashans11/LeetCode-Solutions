class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[][] tab = new int[n + 1][m + 1]; 
        
        int maxLength = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    tab[i][j] = tab[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, tab[i][j]);
                }
            }
        }   
        return maxLength;
    }
}
