class Solution {
    public int minPairSum(int[] nums) 
    {
        Arrays.sort(nums);
        int k = nums.length -1;
        int ans = -1;
        for(int i=0;i<nums.length/2;i++, k--)
        {
            ans = Math.max(ans, nums[i]+nums[k]);
        }
        return ans;

        
    }
}