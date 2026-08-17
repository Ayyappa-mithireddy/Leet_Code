class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x =0;
        int n = operations.length;
        for(int i=0;i<n;i++){
            if(operations[i].charAt(1)=='+'){
                x=x+1;
            }
            else{
                x=x-1;
            }
        }
        return x;
    }
}