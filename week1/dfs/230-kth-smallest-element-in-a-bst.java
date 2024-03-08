package week1.dfs;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
  int answer = 0;
  int count = 0;

  public void inorder(TreeNode node, int k) {
      if (node == null) {
          return;
      }

      inorder(node.left, k);

      count++;
      if (count == k) {
          answer = node.val;
      }

      inorder(node.right, k);
      
      return;
  }

  public int kthSmallest(TreeNode root, int k) {
      inorder(root, k);

      return answer;
  }
}