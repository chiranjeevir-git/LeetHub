class Solution {
    public int robber(int index, int[] nums, int[] dp){
        int pick,notpick;
        if(index == 0 ) return nums[index];
        
        if(index<0) return 0;
            
        if(dp[index]==-1){
          pick = nums[index]+ robber(index-2, nums, dp);
          notpick = 0 + robber(index-1, nums, dp);
            
        dp[index] = Math.max(pick, notpick);
            return Math.max(pick, notpick);
        }else{
            return dp[index];
        }
        
        
    }
    
    
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        Arrays.fill(dp, -1);
        
        return robber(nums.length-1, nums, dp);
        
    }
}