package week1.dfs;

import java.util.ArrayList;
import java.util.List;

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
  private List<Integer> answer = new ArrayList<Integer>();

  public void inorder(TreeNode node) {
      if (node != null) {
          inorder(node.left);
          answer.add(node.val);
          inorder(node.right);
      }

      return;
  }

  public List<Integer> inorderTraversal(TreeNode root) {
      inorder(root);

      return answer;
  }
}