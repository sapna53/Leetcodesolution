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
    public boolean isBalanced(TreeNode root) {
         return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        // Base case:
        if (node == null) {
            return 0;
        }
        // Recursively check left subtree
        int leftHeight = checkHeight(node.left);
        // If left subtree is unbalanced, propagate -1 up
        if (leftHeight == -1) {
            return -1;
        }
        // Recursively check right subtree
        int rightHeight = checkHeight(node.right);
        // If right subtree is unbalanced, propagate -1 up
        if (rightHeight == -1) {
            return -1;
        }
        // Check if current node is balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        // Return height of current node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}