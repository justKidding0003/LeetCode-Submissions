class Solution {
    public int uniquePathsWithObstacles(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int memo[][] = new int[n][m];
        for(int x[]: memo)
        Arrays.fill(x, -1);
        return f(0,0,memo, a);
    }
        public int f(int i,int j, int memo[][], int a[][])
    {
        if(i<0 || j<0 || i >= memo.length || j >= memo[0].length || a[i][j] == 1)
        return 0;
        if(i == memo.length -1 && j == memo[0].length -1 )
        return 1;
        if(memo[i][j] != -1)
        return memo[i][j];

        int aa = f(i+1, j, memo, a);
        int b = f(i, j+1, memo, a);

        return memo[i][j] = aa + b;


    }
}