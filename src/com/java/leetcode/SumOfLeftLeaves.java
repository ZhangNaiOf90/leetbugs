package com.java.leetcode;


/**
 * 404.计算给定二叉树所有左子叶之和
 *  提醒：只计算叶子节点，非叶子节点不算
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SumOfLeftLeaves {
    int result= 0;
    public int sumOfLeftLeaves(TreeNode root) {
        result= 0;
        findNextLeft(root,false);
        return result;
    }

    public void findNextLeft(TreeNode node, Boolean isLeft){
        if(node != null) {
            if(isLeft && node.left == null && node.right == null ){
                result +=  node.val;
            }
            findNextLeft(node.left,true);
            findNextLeft(node.right,false);
        }
    }

 public class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
