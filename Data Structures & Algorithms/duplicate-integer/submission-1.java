class Solution {
    public boolean hasDuplicate(int[] nums) {
      int n = nums.length; // make var for the length of the array

      for (int i =0; i < n; i++) { // loop through the array to capture the contens of array.
        for (int j = i + 1; j < nums.length; j++){ // loop through again to see contens of other array
            if (nums[i] == nums[j]){ // we check to see if they have suplicates between each other. 
                return true; // return true if they do 
            }
        }
        
      } 
      return false; // return false if they do not coantain duplicates
    }
}