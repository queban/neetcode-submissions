class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> seen = new HashSet<>(); 
       for (int num : nums){
        if (seen.contains(num)){
            return true;
        }
            seen.add(num);
       }
       return false;
    }
}

/* 
we are given an arary we are going to checdk this array if ere are any duplicate elements 
if there are any we will print true , if not we print false

for this we use a hashset cand we call it seen 

we do a loop to gather the elements in the array 

we do a check of the hashset and if they element is already in the hash set we return trueas it is a duplicate.

if it does we return true and add the number that it contains to the hashmap 

else we return false if none of this is met or if they do not have duplicates.



*/