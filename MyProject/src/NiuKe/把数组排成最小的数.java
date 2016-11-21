package NiuKe;

import java.util.*;

/**
 * Created by syxya on 2016/11/21.
 */
/*
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323
*/
public class 把数组排成最小的数 {
    //思路：把字符拼成ab形式，然后两两比较排序，即可。
    public static String PrintMinNumber(int [] numbers) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i= 0;i<numbers.length;i++)
            list.add(numbers[i]);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String a = o1+""+o2;
                String b = o2+""+o1;
                return a.compareTo(b);
            }
        });
        String res = "";
        for(int l : list)
            res=res+l+"";
        return res;
    }


    public static void main(String[] args) {
        int[] array = new int[]{3,32,312};
        System.out.println(PrintMinNumber(array));
    }
}
