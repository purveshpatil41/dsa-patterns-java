class Solution {
    public String buildString(String s){
        StringBuilder temp = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '#'){
                temp.append(s.charAt(i));
            } else if (temp.length() > 0){
                temp.deleteCharAt(temp.length() - 1);
            }
        }
        return temp.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        String buildFromS = buildString(s);
        String buildFromT = buildString(t);

        return buildFromS.equals(buildFromT);
    }
}