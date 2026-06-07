/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] a) 
    {
        HashMap<Integer, TreeNode> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<a.length;i++)
        {
            int p = a[i][0];
            int c = a[i][1];
            int hl = a[i][2];

            TreeNode root = hm.getOrDefault(p, new TreeNode(p));
            hs.add(c);
            hm.put(p, root);
            if(hl == 1)
            {
                root.left = hm.getOrDefault(c, new TreeNode(c));
                hm.put(c, root.left);
            }
            else
            {
                root.right = hm.getOrDefault(c, new TreeNode(c));
                hm.put(c, root.right);
            }


        }
        for(int i=0;i<a.length;i++)
            {
                if(!hs.contains(a[i][0]))
                return hm.get(a[i][0]);
            }
        return null;
        
    }
}