class Solution {
    // This Method return the repeting number.
    // Inputs
    // @nums : lsit of integers.
    // Returns repeting integer.
    public int findDuplicate(int[] nums) {
        // Iterate over nums to find duplicate element.
        Set<Integer> seen =  new HashSet<Integer>();
        for (int i: nums) {
            // If i in seen then retuen i else add i to seen.
            if (seen.contains(i))
                return i;
            seen.add(i);
        }
        return -1;
    }
}
