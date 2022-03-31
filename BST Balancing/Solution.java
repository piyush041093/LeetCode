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
//Balance a Binary Search Tree
class Solution {
    /** This method will balance the binary tree
     @root: Tree root node. */
    public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> inorder = new ArrayList<TreeNode>();
        getInorderList(root, inorder);
        System.out.println(inorder.size());
        return buildTree(inorder, 0, inorder.size()-1);
    }
    
    /** Get inorder tree from imbalanced tree.
     @elements: array of elements intree.
     @root: Tree root node. */
    public void getInorderList(TreeNode root, List<TreeNode> inorder) {
        if (root == null)
            return;
        getInorderList(root.left, inorder);
        inorder.add(root);
        getInorderList(root.right, inorder); 
    }
    
    /** Build a tree from given array
     @elements: array of elements intree. */
    public TreeNode buildTree(List<TreeNode> inorder, int start, int end) {
        if (start>end)
            return null;
        int mid = (end+start)/2;
        TreeNode node = inorder.get(mid);
        node.left = buildTree(inorder, start, mid-1);
        node.right = buildTree(inorder, mid+1, end);
        return node;
    }
}
