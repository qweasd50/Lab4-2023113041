package com.example.debug;

import org.junit.Test;
import static org.junit.Assert.*;

public class Solution8Test {

    @Test
    public void testMultipleIslands() {
        Solution8 sol = new Solution8();
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        assertEquals(2, sol.numIslands(copyGrid(grid)));
    }

    @Test
    public void testSingleIsland() {
        Solution8 sol = new Solution8();
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        assertEquals(1, sol.numIslands(copyGrid(grid)));
    }

    @Test
    public void testAllWater() {
        Solution8 sol = new Solution8();
        char[][] grid = {
                {'0','0'},
                {'0','0'}
        };
        assertEquals(0, sol.numIslands(copyGrid(grid)));
    }

    @Test
    public void testOneByOneIsland() {
        Solution8 sol = new Solution8();
        char[][] grid = {{'1'}};
        assertEquals(1, sol.numIslands(copyGrid(grid)));
    }

    // 辅助方法：复制二维数组
    private char[][] copyGrid(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        char[][] copy = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(grid[i], 0, copy[i], 0, cols);
        }
        return copy;
    }
}
