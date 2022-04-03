# Maximum Path Sum
class Solution:
    # This Method will return maximum path sum of the grid.
    # @grid is a 2D list which represents grid.
    def minPathSum(self, grid: List[List[int]],) -> int:
        if not grid or len(grid[0]) == 0:
            return 0
        # Here we will iterate over all elements of grid.
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                # For first element don't run the logic.
                if i == 0 and j ==0:
                    continue
                up = float('inf')
                left = float('inf')
                # Here we will take the minimum value from left and up element and add that to current element.
                if i > 0:
                    up = grid[i-1][j]
                if j > 0:
                    left = grid[i][j-1]
                grid[i][j] += min (up,left)
        return grid[i][j]
