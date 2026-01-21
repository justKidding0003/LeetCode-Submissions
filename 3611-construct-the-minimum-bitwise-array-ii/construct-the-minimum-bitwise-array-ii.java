class Solution {
    public int[] minBitwiseArray(List<Integer> nums) 
    {
        int n = nums.size();
        int ans[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            if(nums.get(i)%2 == 0)
            ans[i] = -1;
            else
            ans[i] = transformNumber(nums.get(i));
        }
        return ans;
    }
    public static int transformNumber(int n) {
        String binary = Integer.toBinaryString(n);
        char[] bits = binary.toCharArray();

        boolean allOnes = true;
        for (char c : bits) {
            if (c == '0') {
                allOnes = false;
                break;
            }
        }
        if (allOnes) {
            binary = "0" + binary;
            bits = binary.toCharArray();
        }

        for (int i = bits.length - 2; i >= 0; i--) {
            if (bits[i] == '0' && bits[i + 1] == '1') {
                bits[i + 1] = '0';
                break;
            }
        }
        String modifiedBinary = new String(bits);
        return Integer.parseInt(modifiedBinary, 2);
    }
}