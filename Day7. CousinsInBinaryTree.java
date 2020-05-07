/*
Cousins In Binary Tree
In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
Return true if and only if the nodes corresponding to the values x and y are cousins.
 
Example 1:
https://assets.leetcode.com/uploads/2019/02/12/q1248-01.png
Input: root = [1,2,3,4], x = 4, y = 3
Output: false
Example 2:
https://assets.leetcode.com/uploads/2019/02/12/q1248-02.png
Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true
Example 3:
https://assets.leetcode.com/uploads/2019/02/13/q1248-03.png
Input: root = [1,2,3,null,4], x = 2, y = 3
Output: false
 
Note:
1. The number of nodes in the tree will be between 2 and 100.
2. Each node has a unique integer value from 1 to 100.
*/
public class CousinBinaryTree {
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
	
	
	public boolean isCousins(TreeNode root, int x, int y) {
		TreeNode parentX = null;
		TreeNode parentY = null;
		int xLevel = -1, yLevel = -1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()) {
        	int size = q.size();
        	level++;
        	while(size-->0) {
        		TreeNode temp = q.remove();
        		if(temp.left != null) {
        			q.offer(temp.left);
        			if(temp.left.val == x) {
        				parentX = temp;
        				xLevel = level;
        			}else if(temp.left.val == y) {
        				parentY = temp;
        				yLevel = level;
        			}
        		}
        		if(temp.right != null) {
        			q.offer(temp.right);
        			if(temp.right.val == x) {
        				parentX = temp;
        				xLevel = level;
        			}else if(temp.right.val == y) {
        				parentY = temp;
        				yLevel = level;
        			}
        		}
        	}
        }
        if(xLevel == yLevel && parentX != parentY)
        	return true;
        return false;
    }


}
