class Solution {
    // This Method will return 2 sum index of target list.
    // @twoSum - list of integers
    // @target - Integer representing target.
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> vals = new HashMap<Integer, Integer>();
        int diff = 0;
        // Iterate over list.
        for (int i = 0; i<nums.length;i++){
            diff = target - nums[i];
            // If difference between target and int at i th position is in the vals then return their intexes. else add the index and value to the vals.
            if (vals.containsKey(diff)) {
                return new int[] {vals.get(diff), i};
            }
            vals.put(nums[i],i);
        }
        return new int[] {};
    }
}
