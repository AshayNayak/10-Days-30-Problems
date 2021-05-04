// https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/
// 4th Day

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
         int n = arr.length;
        int res = 1;
        
       Arrays.sort(arr);
        arr[0]=1;
        for(int i=1;i<n;i++){
            if(arr[i]>res){
                res++;
            }
        }
        
        return res;
    }
}