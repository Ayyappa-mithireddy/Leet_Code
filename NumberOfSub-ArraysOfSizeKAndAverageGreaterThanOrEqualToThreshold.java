class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left =0;
        int currentSum=0;
        int maxAvg =0;
        int cnt=0;
        for(int right =0;right<arr.length;right++){
            currentSum+=arr[right];
            if(right >=k-1){
                if((currentSum/k) >= threshold){
                    cnt++;
                }
                currentSum-=arr[left];
                left++;
            }
        }
        return cnt;
    }
}
