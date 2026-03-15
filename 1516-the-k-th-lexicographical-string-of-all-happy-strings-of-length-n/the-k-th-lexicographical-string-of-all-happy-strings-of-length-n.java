class Solution {
    ArrayList<String> res = new ArrayList<>();
    public String getHappyString(int n, int k) 
    {
        f(n, "");
        if(res.size()<k)
        return "";
        return res.get(k-1);

    }
    public void f(int n, String s )
    {
        if(s.length() == n)
        {
            res.add(s);
            return;
        }
        for(char i = 'a'; i<='c'; i++)
        {
            if(s.length()>0 && s.charAt(s.length() - 1) == i)
            continue;
            //s = s+i;
            f(n, s+i);
        }
        return;
    }

}