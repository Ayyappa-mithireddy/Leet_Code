class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : friends){
            hm.put(i,1);
        }
        int[] ans = new int[friends.length];
        int index =0;
        for(int j : order){
            if(hm.containsKey(j)){
                ans[index]=j;
                index++;
            }
        }
        return ans;
    }
}
