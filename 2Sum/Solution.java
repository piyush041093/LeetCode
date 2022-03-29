class Solution:
    # This Method will return 2 sum index of target list.
    # @twoSum - list of integers
    # @target - Integer representing target.
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        if not nums:
            return []
        numDic = {}
        # Iterate over list.
        for i in range (len(nums)):
            curr =  nums[i]
            var = target - curr
            # If difference between target and int at i th position is in the vals then return their intexes. else add the index and value to the vals.
            if var in numDic:
                return [numDic[var],i]
            numDic[curr] = i
        return []
