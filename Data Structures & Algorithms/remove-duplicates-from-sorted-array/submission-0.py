class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 1                        # nums[0] is always unique
        for i in range(1, len(nums)):
            if nums[i] != nums[k - 1]:   # nums[k-1] is the last value we kept
                nums[k] = nums[i]
                k += 1
        return k