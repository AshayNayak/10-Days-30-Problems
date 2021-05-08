// https://leetcode.com/problems/max-points-on-a-line/
// Day 7

class Solution {
public:
    int maxPoints(vector<vector<int>>& points) {
      
        int n = points.size();
        int ans=0;
        for(int i=0;i<n;i++){
            int dup=1;
            int x=0;
            map<pair<int,int>,int> my;
            for(int j=i+1;j<n;j++){
                
                if(points[i][0]==points[j][0]&&points[i][1]==points[j][1])dup++;
                else if(points[i][0]==points[j][0]){
                    x++;
                }
                else{
                    int dx = points[j][0]-points[i][0];
                    int dy = points[j][1]-points[i][1];
                    
                    int gcd = __gcd(dy,dx);
                    dx/=gcd;
                    dy/=gcd;
                    my[{dx,dy}]++;
                    
                }
            }
            
            int maxi=0;
            for(auto it=my.begin();it!=my.end();it++){
                if(maxi<it->second){
                    maxi=it->second;
                }
            }
            
            maxi=max(maxi,x);
            maxi+=dup;
            ans=max(ans,maxi);
        }
        
        
        return ans;
    }
};