class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0;
        int product =1;
        boolean ans = false;
        int num =n;
        while(num>0){
            int dig = num%10;
            sum = sum+dig;
            product = product*dig;
            num = num/10;
        }
        if(n%(sum + product)==0){
            ans = true;
        }
        return ans;
    }
}