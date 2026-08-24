class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> seen = new  HashMap<>();
        seen.put(0,1);
        int subcnt =0;
        int prefixsum =0;
        for(int i=0;i<nums.length;i++){
             prefixsum+=nums[i];
             int req = prefixsum - k;
             if(seen.containsKey(req)){
                subcnt += seen.get(req); 
             }
             seen.put(prefixsum,seen.getOrDefault(prefixsum,0)+1);
        }
        return subcnt;
    }
}