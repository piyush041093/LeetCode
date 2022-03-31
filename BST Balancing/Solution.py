# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
# Balance a Binary Search Tree
class Solution:
    # This method will balance the binary tree
    # @root: Tree root node. 
    def balanceBST(self, root: TreeNode) -> TreeNode:
        elements = []
        elements = self.getInorderTree(root)
        print(elements)
        return self.createTree(elements)
    
    # Get inorder tree from imbalanced tree.
    # @elements: array of elements intree.
    # @root: Tree root node.
    def getInorderTree(self, root: TreeNode) -> List[TreeNode]:
        if not root:
            return []
        elements = []
        elements += self.getInorderTree(root.left)
        elements.append(root.val)
        elements += self.getInorderTree(root.right)
        return elements
    
    # Build a tree from given array
    # @elements: array of elements intree.
    def createTree(self, elements: List[TreeNode]) -> TreeNode:
        if not elements:
            return None
        mid = len(elements)//2
        node = TreeNode(elements[mid])
        node.left = self.createTree(elements[:mid])
        node.right = self.createTree(elements[mid+1:])
        return node
