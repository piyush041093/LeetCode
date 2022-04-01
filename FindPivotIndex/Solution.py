# Find Pivot Index
class Solution:
    # This method will return pivot index of an array.
    # @nums - array of which pivoting index needs to be found.
    def pivotIndex(self, nums: List[int]) -> int:
        if not nums:
            return -1
        rightSum = sum(nums)
        leftSum  = 0
        # Iterate over list.
        for i in range(len(nums)):
            curr = nums[i]
            rightSum -= curr
            if rightSum == leftSum:
                return i
            leftSum += curr
        return -1
