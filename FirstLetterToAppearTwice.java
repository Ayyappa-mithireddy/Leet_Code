class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            if(hm.get(ch)==2){
                return ch;
            }
        }
        return ' ';
    }
}
