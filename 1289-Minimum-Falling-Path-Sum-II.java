// https://leetcode.com/problems/minimum-falling-path-sum-ii/
// 5th May

class Solution {
    public int minFallingPathSum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int fm=0,sm=0,pos=-1;
        
        for(int i=0;i<n;i++){
            int fm2=Integer.MAX_VALUE,sm2=Integer.MAX_VALUE,pos2=-1;
            
            for(int j=0;j<m;j++){
                int min = (j!=pos)?fm:sm;
                if(arr[i][j]+min<fm2){
                    sm2 = fm2;
                    fm2=arr[i][j]+min;
                    pos2 = j;
                }
                else{
                    sm2 = Math.min(sm2,arr[i][j]+min);
                }
            }
            
            fm=fm2;sm=sm2;pos=pos2;
        }
        
        return fm;
    }
}