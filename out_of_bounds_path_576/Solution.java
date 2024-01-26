package out_of_bounds_path_576;

import java.util.Arrays;

public class Solution {
    //Define constant mod and variables to be filled
    long mod = (long) 1e9 + 7;
    int columns;
    int rows;
    long[][][] memo;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        //Sets global var
        rows = m;
        columns = n;
        //Offset maxMove by 1 so that all moves are included i.e. 0-50
        memo = new long[m][n][maxMove + 1];
        //Sets all values in memo to -1 to indicate that no value has been given to it and can be filled
        for (long[][] arr : memo) {
            for (long[] subArr : arr) {
                Arrays.fill(subArr, -1);
            }
        }
        return (int) dfs(startRow, startColumn, maxMove);
    }

    public long dfs(int row, int col, int moves) {
        //Return 1 indicates a valid path to outside boundary
        if (row < 0 || row == rows || col < 0 || col == columns) {
            return 1;
        }
        //Return 0 to indicate that no more moves are available and so end of path for this node
        if (moves == 0) {
            return 0;
        }
        //Checks if the calculated value matches the default 'unknown' value and if not, will retrieve value in memo
        // and return it
        if (memo[row][col][moves] != -1) {
            return memo[row][col][moves];
        }

        //This will store and return the value of this calculated path and carry on executing until all possibilities
        // executed
        return memo[row][col][moves] = (dfs(row + 1, col, moves - 1) +
                dfs(row - 1, col, moves - 1) +
                dfs(row, col + 1, moves - 1) +
                dfs(row, col - 1, moves - 1)) % mod;
    }
}