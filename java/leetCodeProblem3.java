class Solution {

  //To get the length of substring along with Substring remove the commented lines
  
        // private String longestSubstring = "";
  
    public int lengthOfLongestSubstring(String s) {
      
        Set<Character> window = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        // int start = 0;

        for (int right = 0; right < s.length(); right++) {
            while (window.contains(s.charAt(right))) {
                window.remove(s.charAt(left));
                left++;
            }
            window.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);

            // if (right - left + 1 > maxLength) {
            //     maxLength = right - left + 1;
            //     start = left;
            // }
          
        }
      
        // longestSubstring = s.substring(start, start + maxLength);
        
        return maxLength;
    }

    // public String getLongestSubstring() {
    //     return longestSubstring;
    // }

    public static void main(String[] args) {
      
        String s = "abcabcbb";
        Solution sol = new Solution();
        int result = sol.lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring is: " + result);
        
       // System.out.println("Longest substring is: " + sol.getLongestSubstring());
    
    }
}
