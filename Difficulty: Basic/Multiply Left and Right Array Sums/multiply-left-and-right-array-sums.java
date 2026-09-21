class Solution {
    public int multiply(int[] arr) {
        // code here
       
        if(arr==null || arr.length==0){
            return 0;
        }
        int lm=0;
        int rm=0;
        int mid = arr.length/2;
        for(int i=0;i<mid;i++){
            lm+=arr[i];
        }
        for(int i=mid;i<arr.length;i++){
            rm+=arr[i];
        }
        return rm*lm;
    }
}
