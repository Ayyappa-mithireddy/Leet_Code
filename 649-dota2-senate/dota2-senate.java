class Solution {
    public String predictPartyVictory(String senate) {
        int n =senate.length();
        ArrayDeque<Integer> r = new ArrayDeque<>();
        ArrayDeque<Integer> d = new ArrayDeque<>();
        char[] arr = senate.toCharArray();
        for(int i =0;i<arr.length;i++){
            if( arr[i]== 'R'){
                r.add(i);
            }
            else{
                d.add(i);
            }
        }
        while(!r.isEmpty() && !d.isEmpty()){
            if(r.peek() < d.peek()){
                d.pollFirst();
                r.add(r.pollFirst()+n);
            }
            else{
                r.pollFirst();
                d.add(d.pollFirst()+n);
            }
        }
        if(r.isEmpty()){
            return "Dire";
        }
        else{
            return "Radiant";
        }


    }
}