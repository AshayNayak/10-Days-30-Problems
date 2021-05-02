// https://leetcode.com/problems/minimum-adjacent-swaps-to-reach-the-kth-smallest-number/
// 3rd May


class Solution {
public:
    int getMinSwaps(string num, int k) {
        string original = num;
        
        for(int i=0;i<k;i++){
            next_permutation(num.begin(),num.end());
            //cout<<num<<endl;
        }
        
        int i=0;
        int ans=0;
        
        while(i<num.size()){
            int j=i;
            
            while(original[i]!=num[j])j++;
            
            while(i<j){
                swap(num[j],num[j-1]);
                j--;
                ans++;
            }
            
            i++;
        }
        
        return ans;
    }
};
