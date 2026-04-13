class Solution {
    public int uniquePaths(int m, int n) 
    {
        int memo[][] = new int[m][n];
        for(int x[]: memo)
        Arrays.fill(x, -1);
        return f(0,0,memo);

    }

    public int f(int i,int j, int memo[][])
    {
        if(i<0 || j<0 || i >= memo.length || j >= memo[0].length)
        return 0;
        if(i == memo.length -1 && j == memo[0].length -1 )
        return 1;
        if(memo[i][j] != -1)
        return memo[i][j];

        int a = f(i+1, j, memo);
        int b = f(i, j+1, memo);

        return memo[i][j] = a + b;


    }
}