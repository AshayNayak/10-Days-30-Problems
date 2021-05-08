// https://leetcode.com/problems/wildcard-matching/
// Day 8

class Solution {
public:
    bool isMatch(string s, string p) {
        int n = s.size();
        int m = p.size();
        bool dp[n+1][m+1];
        dp[0][0]=true;
        for(int i=1;i<=n;i++)dp[i][0]=false;
        int flag=1;
        for(int j=0;j<m;j++){
            if(p[j]=='*'&&flag)dp[0][j+1]=true;
            else{
                flag=0;
                dp[0][j+1]=false;
            }
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s[i-1]==p[j-1]||p[j-1]=='?')dp[i][j]=dp[i-1][j-1];
                else if(p[j-1]=='*')dp[i][j]=dp[i-1][j]||dp[i][j-1];
                else dp[i][j]=false;
            }
        }
        
        return dp[n][m];
    }
};