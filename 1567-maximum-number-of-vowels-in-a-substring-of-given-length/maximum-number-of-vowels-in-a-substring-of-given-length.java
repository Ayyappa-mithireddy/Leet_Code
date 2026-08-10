class Solution {
    public int maxVowels(String s, int k) {
        char[] arr = s.toCharArray();
        int left =0;
        int maxcount=0;
        int cnt=0;
        for(int right =0;right<arr.length;right++){
            if("aeiou".indexOf(arr[right])!=-1){
                cnt++;
            }
            if(right>=k-1){
                maxcount = Math.max(cnt,maxcount);
                if("aeiou".indexOf(arr[left])!=-1){
                    cnt--;
                }
                left++;
            }
        }
        return maxcount;
    }
}