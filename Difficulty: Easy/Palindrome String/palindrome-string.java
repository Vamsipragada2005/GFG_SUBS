class Solution {
    boolean isPalindrome(String s) {
        // code here
        String sr = new StringBuilder(s).reverse().toString();
        if(s.equalsIgnoreCase(sr)){
            return true;
        }else{
            return false;
        }
    }
}