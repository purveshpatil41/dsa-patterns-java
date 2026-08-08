class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();

        int left  = 0;
        int right = n-1;
        while(left < right){
            char leftCh = Character.toLowerCase(s.charAt(left));
            char rightCh = Character.toLowerCase(s.charAt(right));
            if(!Character.isLetterOrDigit(leftCh)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(rightCh)){
                right--;
                continue;
            }
            if(leftCh != rightCh){
                return false;
            }else{
                left++;
                right--;
            }
            
        }
        return true;
    }
}