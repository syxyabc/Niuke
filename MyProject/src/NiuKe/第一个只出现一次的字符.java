package NiuKe;

import java.util.*;

/**
 * Created by fish123 on 2016/11/22.
 */
public class 第一个只出现一次的字符 {

    public static int FirstNotRepeatingChar(String str) {
        char[] a = str.toCharArray();
        TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
        for(int i = 0;i<a.length;i++)
        {
            if(treeMap.get(String.valueOf(a[i]))!=null)
            {
                Integer s = treeMap.get(String.valueOf(a[i]));
                s = s+1;
                treeMap.put(String.valueOf(a[i]),s);
            }
            else
                treeMap.put(String.valueOf(a[i]),0);
        }

       Iterator it= treeMap.entrySet().iterator();
        int i = 0;
       while(it.hasNext())
       {
           Map.Entry<String,Integer> me = ( Map.Entry<String,Integer>)it.next();
           if(me.getValue()==0)
           {System.out.println(i);break;}
           i++;
       }

        return 0;
    }

    public static int FirstNotRepeatingChar2(String str) {
        for(int i = 0;i<str.length();i++)
        {
            if(i==str.length()-1)
                return str.length()-1;
            int m = i+1;
            String a = str.substring(m);
            String b = str.substring(0,i);
            if(!a.contains(String.valueOf(str.charAt(i)))&&!b.contains(String.valueOf(str.charAt(i))))
            {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar2("mmst"));

    }
}
