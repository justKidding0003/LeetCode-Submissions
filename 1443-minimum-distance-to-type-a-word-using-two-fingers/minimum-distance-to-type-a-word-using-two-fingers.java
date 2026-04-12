class Solution {
    public int minimumDistance(String word) 
    {
        int len = word.length();
        int dp[][][] = new int[301][27][27];
        for(int i=0; i<301; i++)
        for(int j=0; j<27; j++)
        Arrays.fill(dp[i][j], -1);
        return  
        f(dp, 26, 26, word, 0);
        /*int ans =(int) 1e9;
        for(int i=0;i<len; i++)
        {
            for(int j=0; j<27; j++)
            {
                for(int k=0; k<27; k++)
                ans = Math.min(dp[i][j][k], ans);
            }
        }
        return ans;*/
    }
    public int f(int dp[][][], int f1, int f2, String word, int i)
    {
        if(i == word.length())
        return 0;
        if(dp[i][f1][f2] != -1)
        return dp[i][f1][f2];
        int cur = word.charAt(i) - 'A';
        int case1 = dist(f1, cur) + f(dp, cur, f2, word, i+1);
        int case2 = dist(f2, cur) + f(dp, f1, cur, word, i+1);
        return dp[i][f1][f2] = Math.min(case1, case2);
    }
    int dist(int a, int b){
        if(a == 26 || b == 26) return 0;

        int r1 = a / 6, c1 = a % 6;
        int r2 = b / 6, c2 = b % 6;

        return Math.abs(r1-r2) + Math.abs(c1-c2);
    }

}