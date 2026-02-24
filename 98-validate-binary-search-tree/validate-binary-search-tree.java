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
    ArrayList<Integer> arr = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        //ArrayList<Integer> arr = new ArrayList<>();
        inorder(root);
        int pre = arr.get(0);
        for(int i=1;i<arr.size();i++)
        {
            if(arr.get(i)<=pre)
            {
                return false;
                //break;
            }
            pre = arr.get(i);
        }
        return true;
        
    }
    public void inorder(TreeNode root)
    {
        if(root == null)
        return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);

    }
}