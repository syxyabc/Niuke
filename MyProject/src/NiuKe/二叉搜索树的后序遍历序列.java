package NiuKe;

public class 二叉搜索树的后序遍历序列 {

	public static boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence.length==0)
		{
			return false;
		}
		int n = sequence.length;
		return SequenceBst(sequence ,0,n-1);
    }
	public static boolean SequenceBst(int[] a,int left,int right)
	{
		if(left>=right)
			return true;
		int i = right;
		while(i>left&&a[i-1]>a[right]) i--;
		int mid = i;
		while(i>left)
		{
			if(a[i-1]>a[right])
				return false;
			i--;
		}
		return SequenceBst(a,left,mid-1)&&SequenceBst(a,mid,right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[]{4,8,6,12,14,13,10};
		System.out.println(VerifySquenceOfBST(a));
	}

}
