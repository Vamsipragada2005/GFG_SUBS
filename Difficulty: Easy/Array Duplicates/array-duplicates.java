class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate =  new HashSet<>();
        for(int num:arr){
            if(!seen.add(num)){
                duplicate.add(num);
            }
        }
        ArrayList<Integer> result = new ArrayList<>(duplicate);
        return result;
    }
}