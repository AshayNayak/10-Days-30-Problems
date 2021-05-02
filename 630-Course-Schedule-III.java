//https://leetcode.com/problems/course-schedule-iii/
// 3rd May

class Solution {
    public int scheduleCourse(int[][] courses) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        
        Arrays.sort(courses,(a,b)->a[1]-b[1]);
        int time = 0;
        int i=0;
        int n = courses.length;
        while(i<n){
            time+=courses[i][0];
            pq.add(courses[i][0]);
            if(time>courses[i][1]){
                int temp = pq.poll();
                time-=temp;
            }
            i++;
        }
        
        return pq.size();
        
        
    }
}