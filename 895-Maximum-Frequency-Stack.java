//https://leetcode.com/problems/maximum-frequency-stack/
// 4th May

class FreqStack {
    Map<Integer,Integer> freq;
    Map<Integer,Stack<Integer>> grp;
    int maxFreq;
    public FreqStack() {
        freq = new HashMap();
        grp = new HashMap();
        maxFreq = 0;
    }
    
    public void push(int val) {
        int f = freq.getOrDefault(val,0)+1;
        freq.put(val,f);
        if(f>maxFreq)maxFreq = f;
        
        grp.computeIfAbsent(f,z->new Stack()).push(val);
    }
    
    public int pop() {
        int temp = grp.get(maxFreq).pop();
        freq.put(temp,freq.get(temp)-1);
        
        if(grp.get(maxFreq).size()==0)maxFreq--;
        return temp;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */