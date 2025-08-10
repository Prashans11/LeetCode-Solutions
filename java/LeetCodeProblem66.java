class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1; 
        
        // Traversing array from R to L
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;  
            carry = sum / 10; 
        }
        
        // If there's still a carry left, add new digit at the beginning
        if (carry == 1) {
            int[] result = new int[n + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        }
        
        return digits;
    }
}
