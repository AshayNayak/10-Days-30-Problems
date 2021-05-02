// https://leetcode.com/problems/splitting-a-string-into-descending-consecutive-values/
// 2nd May

class Solution {
public:
     vector<unsigned long long> vec;
    
    bool f(string str,int idx){
        if(idx==str.size())return true;
        for(int i=idx;i<str.size();i++){
            string temp = str.substr(idx,i-idx+1);
           if(temp.size()==20)return false;
            unsigned long long temp_num = stoull(temp);
           // cout<<temp_num<<endl;
            int len=vec.size();
           /* if(temp_num==2){
                cout<<"hi";
                cout<<vec[len-1]<<endl;
            }*/
            
            if(len==0||(vec[len-1]>temp_num&&(vec[len-1]-temp_num==1))){
                vec.push_back(temp_num);
                bool f_val=f(str,i+1);
                if(f_val==false){
                    //cout<<"oops";
                //cout<<vec[vec.size()-1]<<endl;
                vec.pop_back();
                     
                }
                else return true;
            }
            else if(vec[len-1]<temp_num){return false;}
               
            
        }
        
        return false;
        
    }
    bool splitString(string s) {
       
        int n = s.size();
        f(s,0);
        //cout<<vec[len-1]
        if(vec.size()<=1)return false;
        return true;
        
    }
};