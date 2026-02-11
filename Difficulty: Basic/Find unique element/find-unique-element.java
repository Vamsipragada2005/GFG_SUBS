class Solution {
    public int findUnique(int k, int[] arr) {
        int result = 0;
        
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            
        
            for (int num : arr) {
                if ((num & (1 << i)) != 0) {
                    sum++;
                }
            }
            
        
            if (sum % k != 0) {
                result |= (1 << i);
            }
        }
        
        return result;
    }
}
