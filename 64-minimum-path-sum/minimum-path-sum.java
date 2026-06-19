class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int memo[][] = new int[n][m];
        for(int x[]: memo)
        Arrays.fill(x, -1);
        return f(0,0,memo, grid);
        //return memo[n-1][m-1];
    }
        public int f(int i,int j, int memo[][], int grid[][])
    {
        if(i<0 || j<0 || i >= memo.length || j >= memo[0].length)
        return (int) 1e9;
        if(i == memo.length -1 && j == memo[0].length -1 )
        return grid[i][j];
        if(memo[i][j] != -1)
        return memo[i][j];

        int a = grid[i][j] + f(i+1, j, memo, grid);
        int b = grid[i][j] + f(i, j+1, memo, grid);

        return memo[i][j] = Math.min(a, b);


    }
}