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

  public void postorder(TreeNode node) {
      if (node != null) {
          postorder(node.left);
          postorder(node.right);
          answer.add(node.val);
      }

      return;
  }

  public List<Integer> postorderTraversal(TreeNode root) {
      postorder(root);

      return answer;
  }
}