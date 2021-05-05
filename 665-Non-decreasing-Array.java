//https://leetcode.com/problems/non-decreasing-array/
// 5th May

class Solution {
    public boolean checkPossibility(int[] nums) {
        int n= nums.length;
        int cnt=0;
        
        for(int i=0;i<n-1;i++){
            if(nums[i+1]<nums[i]){
                if(i!=0){
                    int temp1 = nums[i],temp2=nums[i+1];
                    if(temp2>=nums[i-1]){
                        nums[i]=temp2;
                    }
                    else{
                        nums[i+1]=temp1;
                    }
                }
                else{
                    nums[i]=nums[i+1];
                }
                
                
                cnt++;
            }
            
            if(cnt>1){
                break;
            }
        }
        
        if(cnt>1)return false;
        return true;
    }
}