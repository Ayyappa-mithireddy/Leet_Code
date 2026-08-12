class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            char ch = s2.charAt(right);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            if (right >= s1.length() - 1) {
                if (hm.equals(mp)) {
                    return true;
                }
                char leftChar = s2.charAt(left);
                mp.put(leftChar, mp.get(leftChar) - 1);
                if (mp.get(leftChar) == 0) {
                    mp.remove(leftChar);
                }
                left++;
            }
        }
        return false;
    }
}