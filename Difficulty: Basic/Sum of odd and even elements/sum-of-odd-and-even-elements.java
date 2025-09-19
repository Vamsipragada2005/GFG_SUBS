// User function Template for Java

class Solution {
    public int[] findSum(int n) {
        // Code here
        int oddsum =0;
        int evensum =0;
        for(int i = 1; i<=n;i++){
            if(i%2!=0){
                oddsum+=i;
                
            }else{
                evensum+= i;
            }
            
        }
        return new int[]{oddsum,evensum};
    }
}