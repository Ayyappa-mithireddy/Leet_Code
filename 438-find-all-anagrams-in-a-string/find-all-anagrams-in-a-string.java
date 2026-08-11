class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       HashMap<Character,Integer> hm = new HashMap<>();
       HashMap<Character,Integer> mp = new HashMap<>();
       List<Integer> list = new ArrayList<>();
       for(char ch : p.toCharArray()){
        hm.put(ch,hm.getOrDefault(ch,0)+1);
       } 
       int left =0;
       char[] arr = s.toCharArray();
       for(int right =0;right<arr.length;right++){
        char ch = arr[right];
        mp.put(ch,mp.getOrDefault(ch,0)+1);
        if(right >=p.length()-1){
            if(hm.equals(mp)){
                list.add(left);
            }
         char leftChar = arr[left];
         mp.put(leftChar,mp.get(leftChar)-1);
         if(mp.get(leftChar)==0){
            mp.remove(leftChar);
         }
            left++;
        }
    }
    return list;
    }
}