class Solution {
    public static boolean matSearch(int mat[][], int x) {
        int n = mat.length;
        if (n == 0) return false;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            int low = 0, high = m - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (mat[i][mid] == x) {
                    return true;
                } else if (mat[i][mid] < x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
