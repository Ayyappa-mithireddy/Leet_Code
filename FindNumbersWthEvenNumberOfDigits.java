class Solution {
    public int findNumbers(int[] nums) {
        int output=0;
        for(int i = 0;i<nums.length;i++){
          int count = 0;
          int number = nums[i];
          while(number> 0)
          {
            number=number/10;
            count++;
          }
        
        if(count % 2 == 0)
        {
             output++;
        }
        }
        return output;
    
     }
}    
