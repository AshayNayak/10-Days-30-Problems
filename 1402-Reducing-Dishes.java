//https://leetcode.com/problems/reducing-dishes/
//1st May

class Solution {
    public int maxSatisfaction(int[] s) {
        Arrays.sort(s);
        int ans=0;
        int total=0;
        for(int i=s.length-1;i>=0&&s[i]>-total;i--){
            total+=s[i];
            ans+=total;
        }
        
        return ans;
    }
}