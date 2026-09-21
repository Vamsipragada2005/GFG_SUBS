class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
       ArrayList<Integer> prefixSum = new ArrayList<>();
       if(arr == null|| arr.length==0){
           return prefixSum;
       }
       int n = arr.length;
       int [] prefix = new int[n];
       prefix[0] =arr[0];
       
       prefixSum.add(prefix[0]);
       for(int i=1;i<n;i++){
           prefix[i] = prefix[i-1]+arr[i];
           prefixSum.add(prefix[i]);
       }
       return prefixSum;
        
    }
}