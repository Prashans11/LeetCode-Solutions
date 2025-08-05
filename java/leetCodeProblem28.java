public class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0;

        for (int i = 0; i <= n - m; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                boolean match = true;

                for (int j = 1; j < m; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) return i;
            }
        }
        return -1;
    }
}
//time complexity -- worst case O(n*m)
