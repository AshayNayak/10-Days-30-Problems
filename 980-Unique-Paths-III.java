//https://leetcode.com/problems/unique-paths-iii/
// 1st May


class Solution {
    int empty=1,ans=0,sx,sy;
    public int uniquePathsIII(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0)empty++;
                else if(grid[i][j]==1){
                    sx=i;sy=j;
                }
            }
        }
        
        
        dfs(grid,sx,sy);
        
        return ans;
    }
    
    public  void dfs(int[][] grid,int x,int y){
        if(x<0||y<0||x>=grid.length||y>=grid[0].length||grid[x][y]<0)return;
        
        if(grid[x][y]==2){
            if(empty==0)ans++;
            return;
        }
        
        grid[x][y]=-2;
        empty--;
        dfs(grid,x+1,y);dfs(grid,x-1,y);dfs(grid,x,y+1);dfs(grid,x,y-1);
        
        grid[x][y]=0;
        empty++;
    }
}