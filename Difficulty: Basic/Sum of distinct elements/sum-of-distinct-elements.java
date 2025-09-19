// User function Template for Java

class Solution {
    int findSum(int arr[]) {
        // code here
        HashSet <Integer> seen = new HashSet<>();
        int sum = 0;
        for(int num:arr){
            seen.add(num);
        }
        for(int num : seen){
            sum+= num;
        }
        return sum;
    }
}