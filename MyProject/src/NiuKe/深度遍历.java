package NiuKe;

public class 深度遍历 {

	public static void depthSearch(TreeNode tn)
	{
		if(tn==null)
			return ;
		System.out.print(tn.val+" ");
		if(tn.left!=null)
			depthSearch(tn.left);
		if(tn.right!=null)
			depthSearch(tn.right);
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
		depthSearch(tn1);
	}

}
