class GfG {
    /*you are required to complete this method*/
    int countZeros(int A[][], int N) {
        // Your code here
        int row = 0;
        int col = N -1;
        int count=0;
        while(row< N&& col>=0){
            if(A[row][col]==0){
                count+=(col+1);
                row++;
            }else{
                col--;
            }
        }
        return count;
    }
}