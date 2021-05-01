//https://leetcode.com/problems/seat-reservation-manager/
// 1st May

class SeatManager {
public:
    set<int> st;
    SeatManager(int n) {
        for(int i=1;i<=n;i++)st.insert(i);
    }
    
    int reserve() {
        auto it = st.begin();
        int temp = *it;
        st.erase(it);
        return temp;
        
    }
    
    void unreserve(int seatNumber) {
        st.insert(seatNumber);
    }
};

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager* obj = new SeatManager(n);
 * int param_1 = obj->reserve();
 * obj->unreserve(seatNumber);
 */