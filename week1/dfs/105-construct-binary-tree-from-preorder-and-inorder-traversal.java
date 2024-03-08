package week1.dfs;

import java.util.HashMap;
import java.util.Map;

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
  private TreeNode splitTree(int[] preorder, Map<Integer, Integer> map, int pindex, int leftLimit, int rightLimit) {
      int rightVal = preorder[pindex];
      int mid = map.get(rightVal);

      TreeNode root = new TreeNode(rightVal);

      if (mid > leftLimit) {
          root.left = splitTree(preorder, map, pindex + 1, leftLimit, mid - 1);
      }

      if (mid < rightLimit) {
          root.right = splitTree(preorder, map, pindex + mid - leftLimit + 1, mid + 1, rightLimit);
      }

      return root;
  }

  public TreeNode buildTree(int[] preorder, int[] inorder) {
      Map<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < inorder.length; i++) {
          map.put(inorder[i], i);
      }

      return splitTree(preorder, map, 0, 0, inorder.length - 1);
  }
}