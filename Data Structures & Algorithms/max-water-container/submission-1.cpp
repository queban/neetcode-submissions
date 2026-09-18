class Solution {
public:
    int maxArea(vector<int>& heights) {
        int left= 0;
        int right = heights.size()-1;
        int heightlet;
        int maxarea = 0;
        int runningarea;
        int length;

        while(left < right){
            heightlet = min(heights[left], heights[right]);
            length = right - left;
            runningarea = length * heightlet;
            maxarea = max(maxarea, runningarea);
            if(heights[left] < heights[right]){
                left++;
            }
            else {
                right--;
            }    
        }
        return maxarea;
    }
};
