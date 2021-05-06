// https://leetcode.com/problems/swim-in-rising-water/
// 6 Day


class Solution {
public:
    int swimInWater(vector<vector<int>>& grid) {
        priority_queue<pair<int,pair<int,int>>,vector<pair<int,pair<int,int>>>,greater<pair<int,pair<int,int>>>> pq;
        int n = grid.size();
        bool seen[n][n];
        memset(seen,false,sizeof seen);
        seen[0][0]=true;
        pq.push({grid[0][0],{0,0}});
        int dir[4][2] = {{0,-1},{0,1},{1,0},{-1,0}};
        int ans=0;
        while(!pq.empty()){
            pair<int,pair<int,int>> temp = pq.top();pq.pop();
            ans = max(ans,temp.first);
            int x = temp.second.first;int y = temp.second.second;
            if(x==n-1&&y==n-1)return ans;
            for(auto d:dir){
                int xx = x+d[0],yy=y+d[1];
                if(xx>=0&&xx<n&&yy>=0&&yy<n&&!seen[xx][yy]){
                    seen[xx][yy]=true;
                    pq.push({grid[xx][yy],{xx,yy}});
                }
            }
            
        }
        
        return ans;
    }
};