class Solution {
    public int closestTarget(String[] words, String target, int startIndex) 
    {
        int n = words.length;
        int ans = (int) 1e9;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].equals(target))
            {
              ans = Math.min(ans, Math.min(Math.abs(i-startIndex), n -  Math.abs(i-startIndex)));
            }
        }
        return ans < n ? ans : -1;
    }
}