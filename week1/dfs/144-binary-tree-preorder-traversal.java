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

  public void preorder(TreeNode node) {
      if (node != null) {
          answer.add(node.val);
          preorder(node.left);
          preorder(node.right);
      }

      return;
  }

  public List<Integer> preorderTraversal(TreeNode root) {
      preorder(root);

      return answer;
  }
}