class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowSum = 0;
        int numOfArrays = 0 ;

        for(int i=0; i<k; i++){
            windowSum += arr[i];   //time complexity for this loop O(k)
        }
        if(threshold <= windowSum/k){
            numOfArrays++;
        }
        for(int i=k; i < arr.length ; i++){
            windowSum = windowSum + arr[i] - arr[i-k];  //time complexity for this code O(n-k)
            if(threshold <= windowSum/k){
                numOfArrays++;
            }
        }   
    return numOfArrays;
    }
}

//overall worst case time complexity ~O(n)
