class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}

/*
           we loop throught the array to gather whats inside
        from there we do a check to see if the elemnts inside nums[i] equal to val , if they do then
   we increment K so we would do a k++ and then have it euqal nums[i]




            */