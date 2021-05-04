//https://leetcode.com/problems/minimum-initial-energy-to-finish-tasks/
// 4th May

class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (b,a)->(a[1]-a[0])-(b[1]-b[0]));
        int energy=0;
        int ans=0;
        for(int i=0;i<tasks.length;i++){
            if(tasks[i][1]>energy){
                int borrow = tasks[i][1]-energy;
                ans+=borrow;
                energy+=borrow;
            }
            
            energy = energy - tasks[i][0];
        }
        
        return ans;
    }
}