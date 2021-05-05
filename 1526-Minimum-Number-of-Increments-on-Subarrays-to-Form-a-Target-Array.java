//https://leetcode.com/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array/
// 5th May

class Solution {
    public int minNumberOperations(int[] target) {
        //https://leetcode.com/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array/discuss/754623/Detailed-Explanation
        int n = target.length;
        int ans=target[0],use=target[0];
        for(int i=1;i<n;i++){
            if(target[i]<=use){
                use = target[i];
            }
            else{
                ans+=(target[i]-use);
                use = target[i];
            }
        }
        
        return ans;
    }
}