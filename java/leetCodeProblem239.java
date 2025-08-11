// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {

//         if (nums == null || nums.length == 0 || k == 0) {
//             return new int[0];
//         }

//         int[] result = new int[nums.length - k + 1];

//         int max = Integer.MIN_VALUE;

//         for (int i = 0; i < k; i++) {
//             max = Math.max(max, nums[i]);
//         }

//         result[0] = max; //storing the max for the first window...

//         for (int i = k; i < nums.length; i++) {
//             if (nums[i] >= max) {
//                 max = nums[i];
//             } else if (nums[i - k] == max) {
//                 max = Integer.MIN_VALUE;

//                 for (int j = i - k + 1; j <= i; j++) {
//                     max = Math.max(max, nums[j]);
//                 }
//             }
//             result[i - k + 1] = max;
//         }
//         return result;
//     }
// }

//worst case timeComplexity -- O(n)

// Use deque to optimise further----------------------------------->

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];
        
        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) 
                deque.pollFirst();

            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i])
                deque.pollLast();

            deque.offerLast(i);

            if (i >= k - 1)
                result[i - k + 1] = nums[deque.peekFirst()];
        }
        return result;
    }
}
