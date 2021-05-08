// https://leetcode.com/problems/longest-valid-parentheses/
// Day 7

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                stk.push(i);
            }
            else{
                if(!stk.isEmpty()&&s.charAt(stk.peek())=='('){
                    stk.pop();
                }
                else{
                    stk.push(i);
                }
            }
        }
        
        if(stk.isEmpty())return n;
        
        int a=n,b=0;
        int ans=0;
        while(!stk.isEmpty()){
            b = stk.peek();stk.pop();
            ans = Math.max(ans,a-b-1);
            a=b;
        }
        ans=Math.max(ans,a);
        return ans;
    }
}
