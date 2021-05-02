// https://leetcode.com/problems/maximum-score-words-formed-by-letters/
// 2nd May

class Solution {
public:
    
    int dfs(vector<string>& words,vector<int>& score, vector<int>& cnt,int i){
        if(i>=words.size())return 0;
        
        //exclude this word
        int ex = dfs(words,score,cnt,i+1);
        vector<int> cnt1(begin(cnt), end(cnt));
        int sum=0;
        int flag=1;
        for(int k=0;k<words[i].size();k++){
            cnt1[words[i][k]-'a']--;
            if(cnt1[words[i][k]-'a']<0){
                flag=0;break;
            }
            sum+=score[words[i][k]-'a'];
        }
        
        return max(ex,flag?sum+dfs(words,score,cnt1,i+1):0);
    }
    int maxScoreWords(vector<string>& words, vector<char>& letters, vector<int>& score) {
        vector<int>  cnt(26,0);
         for(int i=0;i<letters.size();i++){
            cnt[letters[i]-'a']++;
        }
        
        return dfs(words,score,cnt,0);
    }
};