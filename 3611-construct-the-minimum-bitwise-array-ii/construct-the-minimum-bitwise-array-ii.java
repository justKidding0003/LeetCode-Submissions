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
        // Step 1: Convert number to binary
        String binary = Integer.toBinaryString(n);
        char[] bits = binary.toCharArray();

        // Step 2: Check if all bits are '1'
        boolean allOnes = true;
        for (char c : bits) {
            if (c == '0') {
                allOnes = false;
                break;
            }
        }

        // Step 3: If all 1s, prepend '0'
        if (allOnes) {
            binary = "0" + binary;
            bits = binary.toCharArray();
        }

        // Step 4: Traverse from right to left
        for (int i = bits.length - 2; i >= 0; i--) {
            if (bits[i] == '0' && bits[i + 1] == '1') {
                bits[i + 1] = '0';
                break;
            }
        }

        // Step 5: Convert modified binary back to integer
        String modifiedBinary = new String(bits);
        return Integer.parseInt(modifiedBinary, 2);
    }
}