class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] locs = new int[1001];
        int sum = 0;
        for (int[] trip: trips) {
            locs[trip[1]] += trip[0];
            locs[trip[2]] -= trip[0];
        }
        
        for (int loc : locs) {
            sum += loc;
            if (sum > capacity) {
                return false;
            }
        }
        return true;
    }
}