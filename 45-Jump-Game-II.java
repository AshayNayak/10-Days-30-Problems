// https://leetcode.com/problems/jump-game-ii/
// 6 Day
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n==1)return 0;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        
        for(int i=0;i<n;i++){
            
            for(int k=1;k<=nums[i]&&k+i<n;k++){
                if(dp[i+k]==-1)
                dp[i+k] = i;
            }
        }
        
        int temp = dp[n-1];
        int cnt=1;
        while(temp!=0){
            temp = dp[temp];
            cnt++;
        }
        
        return cnt;
    }
}