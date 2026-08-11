class Solution {
    public int lengthOfLongestSubstring(String s) {
     int left =0;
     int longest=0;
     HashSet<Character> set = new HashSet<>();
     char[] arr = s.toCharArray();
     for(int right =0;right<arr.length;right++){
        while(set.contains(arr[right])){
            set.remove(arr[left]);
            left++;
        }
        set.add(arr[right]);
        longest = Math.max(longest,right - left+1);
     }
     return longest;
    }
}