class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder first = new StringBuilder();
        StringBuilder middle = new StringBuilder();
        StringBuilder after = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == y){
                first.append(ch);
            }
            else if(ch == x){
                after.append(ch);
            }
            else{
                middle.append(ch);
            }
        }
        return first.toString()+middle.toString()+after.toString();
    }
}
