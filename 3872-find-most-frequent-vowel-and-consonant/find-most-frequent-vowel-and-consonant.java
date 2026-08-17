class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int maxVowel=0;
        int maxConsonant =0;
        for(char ch : hm.keySet()){
             int freq = hm.get(ch);
            if ("aeiou".indexOf(ch) != -1) {
                maxVowel = Math.max(maxVowel, freq);
            } else {
                maxConsonant = Math.max(maxConsonant, freq);
            }
        }
        return maxVowel + maxConsonant;
    }
}