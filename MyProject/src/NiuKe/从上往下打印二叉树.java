package NiuKe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode
{
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
	TreeNode(int val)
	{
		this.val = val;
	}
}

public class 从上往下打印二叉树 {
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	Queue<TreeNode> st = new LinkedList<TreeNode>() ;
    	st.offer(root);
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	while(!st.isEmpty())
    	{
    		TreeNode tn = st.poll();
    		if(tn.left!=null)
    		{
    			st.offer(tn.left);
    		}
    		if(tn.right!=null)
    		{
    			st.offer(tn.right);
    		}
    		array.add(tn.val);
    		System.out.print(tn.val);
    	}
    	return array;
    }
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn4 = new TreeNode(4);
		TreeNode tn5 = new TreeNode(5);
		TreeNode tn6 = new TreeNode(6);
		TreeNode tn7 = new TreeNode(7);
		tn1.left = tn2;
		tn1.right = tn3;
		tn2.left = tn4;
		tn2.right = tn5;
		tn3.left = tn6;
		tn3.right = tn7;
		PrintFromTopToBottom(tn1);	
		
	}

}
