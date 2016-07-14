package NiuKe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class 二叉树中和为某一值的路径 {
	public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		if(root==null||root.val>target)
			return null;
		ArrayList<ArrayList<Integer>> resal = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> singalres = new ArrayList<Integer>();
		Stack st = new Stack();
		st.push(root);
		int sum = 0;
		while(st!=null)
		{
			TreeNode tn = (TreeNode) st.pop();
			sum = sum+tn.val;
			singalres.add(tn.val);
			if(sum==target)
			{
				singalres.remove(singalres.size()-1);
				sum = sum-tn.val;
				continue;
			}
			if(sum>target)
			{
				singalres.remove(singalres.size()-1);
				sum = sum-tn.val;
				continue;
			}
			if(tn.left!=null)
			{
				st.push(tn.left);
			}
			if(tn.right!=null)
			{
				st.push(tn.right);
			}
			
		}
		return resal;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(2);
		TreeNode tn4 = new TreeNode(3);
		TreeNode tn5 = new TreeNode(3);
		TreeNode tn6 = new TreeNode(3);
		TreeNode tn7 = new TreeNode(1);
		TreeNode tn8 = new TreeNode(6);
		TreeNode tn9 = new TreeNode(2);
		TreeNode tn10 = new TreeNode(4);
		tn1.left = tn2;
		tn1.right = tn3;
		tn2.left = tn4;
		tn2.right = tn5;
		tn3.left = tn6;
		tn3.right = tn7;
		tn4.left = tn8;
		tn7.left = tn9;
		tn7.right = tn10;
		ArrayList<ArrayList<Integer>> al = FindPath(tn1,6);
		Iterator<ArrayList<Integer>> it = al.iterator();
		while(it.hasNext())
		{
			ArrayList<Integer> al2 = it.next();
			Iterator<Integer> it2 = al2.iterator();
			while(it2.hasNext())
			{
				System.out.print(it2.next()+ " ");
			}
			System.out.println();
		}
	}

}
