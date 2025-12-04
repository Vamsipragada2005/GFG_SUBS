

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        int duplicate = -1, missing = -1;

      
        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);
            if (arr[val - 1] < 0) {
                duplicate = val; 
            } else {
                arr[val - 1] = -arr[val - 1]; 
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1; 
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(duplicate);
        result.add(missing);
        return result;
    }
}