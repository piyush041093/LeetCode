// Maximum Path Sum
class Solution {
    /** 
    This Method will return maximum path sum of the grid.
    @grid is a 2D list which represents grid. */
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        int hght = grid.length;
        int width = grid[0].length;
        // Here we will iterate over all elements of grid
        for (int i=0; i<hght;i++){
            for(int j=0; j<width; j++){
                // For first element don't run the logic.
                if (i == 0 && j == 0){
                    continue;
                }
                float up = Float.POSITIVE_INFINITY;
                float left = Float.POSITIVE_INFINITY;
                // Here we will take the minimum value from left and up element and add that to current element.
                if (i>0)
                    up = grid[i-1][j];
                if (j>0)
                    left = grid[i][j-1];
                grid[i][j] += Math.min(up,left);
            }
        }
        return grid[hght-1][width-1];
    }
}
