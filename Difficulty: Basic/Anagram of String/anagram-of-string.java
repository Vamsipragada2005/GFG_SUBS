/*Complete the function below*/
class GfG {
    public int remAnagrams(String s1, String s2) {
        // add code here.
        int[] count = new int[26];
        
        for(char ch : s1.toCharArray()){
            count[ch - 'a']++;
        }
        
        for(char ch : s2.toCharArray()){
            count[ch - 'a']--;
        }
        int deletions = 0;
        for(int i = 0; i< 26; i++){
            deletions+= Math.abs(count[i]);
        }
        return deletions;
    }
}