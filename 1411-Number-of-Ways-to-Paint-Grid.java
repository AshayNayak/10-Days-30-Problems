//https://leetcode.com/problems/number-of-ways-to-paint-n-3-grid/
// 6 Day

class Solution {
    public int numOfWays(int n) {
        //https://leetcode.com/problems/number-of-ways-to-paint-n-3-grid/discuss/574923/JavaC%2B%2BPython-DP-O(1)-Space
    
        long a123=6,a121=6,mod=1000000007;
        
        for(int i=1;i<n;i++){
           long b121 = ((3*a121)%mod + (2*a123)%mod)%mod;
            long b123 = ((2*a121)%mod + (2*a123)%mod)%mod;
            a121 = b121;
            a123 = b123;
        }
        
        
        return (int)((a121+a123)%mod);
    }
}
