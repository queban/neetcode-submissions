class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;

        for (int i = 0; i <n; i++) {
            for (int j = i + 1; j <n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

/*
initalize variable for the length of the array
we will use a nested loop

we do an outer loop to gather the elemnts 
we do an inner loop to check everything after the inital element in array

we do an if comparison of I and j to see if they have any duplicate elements.

if they do we return true. if not we return false.

*/

