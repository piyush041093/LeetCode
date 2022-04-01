// Find Pivot Index
class Solution {
    /** This method will return pivot index of an array.
     @nums - array of which pivoting index needs to be found.*/
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length <1)
            return -1;
        int rightSum = Arrays.stream(nums).sum();
        int leftSum = 0;
        // Iterate over list.
        for(int i = 0; i<nums.length;i++){
            int curr = nums[i];
            rightSum -= curr ;
            if (rightSum ==leftSum)
                return i;
            leftSum += curr;
        }
        return -1;
    }
}
