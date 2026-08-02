class Solution {
    public long maxPairStrength(int[] nums) {
        long maxAvg = Long.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            for(int j = i+1 ; j< nums.length;j++){
                long mult = nums[i] * nums[j];
                long a = nums[i];
                long b = nums[j];
                long g = gcd(a,b);
                long ans = (a/g)*(b/g);
                maxAvg = Math.max(ans,maxAvg);
            }
        }
        return maxAvg;
    }
    private long gcd(long a, long b){
    while(b!=0){
     long temp = b;
        b = a%b;
        a = temp;
       }
    return a;
    }
}
