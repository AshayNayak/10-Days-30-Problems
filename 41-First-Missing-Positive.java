// https://leetcode.com/problems/first-missing-positive/
// Day 8

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            if(nums[i]>0&&nums[i]<=n&&nums[i]!=nums[nums[i]-1]){
            int idx = nums[i]-1;
               int temp = nums[i];
               nums[i] = nums[idx];
               nums[idx] = temp;
                
                i--;
            }
        }
        
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1)return i+1;
        }
        
        return n+1;
    }
}