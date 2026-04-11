class Solution {
    public int minimumDistance(int[] nums) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                ArrayList<Integer> temp = hm.get(nums[i]);
                temp.add(i);
                hm.put(nums[i], temp);

            }
            else
            {
                ArrayList<Integer> t = new ArrayList<>();
                t.add(i);
                hm.put(nums[i], t);
            }
            
        }
        int ans = Integer.MAX_VALUE;
        for(int x : hm.keySet())
            {
                ArrayList temp = hm.get(x);
                System.out.println(x+" ");
                //ans = Math.min(aa)
                if(temp.size()<3)
                continue;
                for(int i=0;i<temp.size()-2;i++)
                {
                    int s = 0;
                    System.out.print(temp.get(i)+" ");
                    int a = (int)temp.get(i);
                    int b = (int)temp.get(i+1);
                    int c = (int)temp.get(i+2);
                    s = f(a, b, c);
                    ans = Math.min(ans, s);
                }
                System.out.println();
            }

        
           return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public int f(int a, int b, int c)
    {
        int sum = 0;
        sum += Math.abs(a - b) + Math.abs(a - c) + Math.abs(c - b);
        return sum;
    }
}