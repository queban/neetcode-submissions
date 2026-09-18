

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length; // var to get length of array
        int count = 0; // var counts the elements it resets for each new element

        for (int num : nums) { // loop stores the toal number of elemnts 
            for (int i : nums) { // loop to track how many times something appears
                if (i == num) { // we check to see if i is equal to the array
                    count++; // incretment
                }
            }
            if (count > n / 2) { // we check
                return num; // if it is we return the most common element
            }
        }
        return -1; // if none we return negative 1
    }
}

/* we are given an array this rray is nums.
we are returning the element that appreas the most in said array
this is determined by n/2 so the length devided by two and the most common element will be there


set int n to array.length

we set another int to count to  track said lements and how many times they appear


for loop ro capture the elements

then we loop again to capture the frequency of elemnts


then I beleive we can do a check

we check to see what  elemtent is n/2 of nums.length so for example we use i as the other int

if (i > n/2)

we would return it

if not we go to the nmext element


worstcase this is just a binary search problem and we have the
left side and the right side we just see which side
had the most of one elemnt then say thats the most ued element
*/
