
class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        Map<Integer, Integer> freqA = new HashMap<>();
        Map<Integer, Integer> freqB = new HashMap<>();

       
        for (int num : a) {
            freqA.put(num, freqA.getOrDefault(num, 0) + 1);
        }

   
        for (int num : b) {
            freqB.put(num, freqB.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();

    
        for (int key : freqA.keySet()) {
            if (freqB.containsKey(key)) {
                int count = Math.min(freqA.get(key), freqB.get(key));
                for (int i = 0; i < count; i++) {
                    result.add(key);
                }
            }
        }

      
        Collections.sort(result);
        return result;
    }
}