class Solution:
    # This Method return the repeting number.
    # Inputs
    # @nums : lsit of integers.
    # Returns repeting integer.
    def findDuplicate(self, nums: List[int]) -> int:
        # Iterate over nums to find duplicate element.
        for i in nums:
            # If count of i is greater than 1 then return i.
            if nums.count(i) >1:
                return i
        return -1
