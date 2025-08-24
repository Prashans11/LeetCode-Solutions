class Solution {
    public String largestNumber(int[] nums) {

        //Convert array of nums into string array
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(strNums, (a, b) -> {
            if ((a + b).compareTo(b + a) > 0) {
                return -1;  
            } else if ((a + b).compareTo(b + a) < 0) {
                return 1; 
            }
            return 0;
        });

        if (strNums[0].equals("0")) {
            return "0";
        }

        //Joining all the string
        StringBuilder largestNumber = new StringBuilder();
        for (String str : strNums) {
            largestNumber.append(str);
        }    
        return largestNumber.toString();
    }
}
