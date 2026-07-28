class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        double currentsum=0;
        double maxAvg = Integer.MIN_VALUE;
        for(int right =0; right <nums.length;right++){
            currentsum+=nums[right];
            if(right >= k-1){
                maxAvg = Math.max(currentsum/k,maxAvg);
                currentsum-=nums[left];
                left++;
            }
        }
        return maxAvg;
    }
} 
