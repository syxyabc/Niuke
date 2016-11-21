package NiuKe;

/**
 * Created by syxya on 2016/11/21.
 */
public class MyUtils {
    public int[] specialQuickSort(int[] numbers, int low, int high)
    {
        if(low>=high)
            return null;
        int start = low;
        int end = high;
        int flag = numbers[start];

        while(start<end)
        {

            while(numbers[end]>=flag&&start<end)
                end--;
            numbers[start] = numbers[end];
            while(numbers[start]<=flag&&start<end)
                start++;
            numbers[end] = numbers[start];
        }
        numbers[start] = flag;

        specialQuickSort(numbers,low,start-1);
        specialQuickSort(numbers,start+1,high);
        return numbers;
    }

    public void quickSort(int[] numbers, int low, int high)
    {
        if(low<high)
        {
            int mid = findMid(numbers,low,high);
            quickSort(numbers,low,mid-1);
            quickSort(numbers,mid+1,high);
        }

    }
    public int findMid(int[] numbers, int low, int high)
    {
        int flag = numbers[low];
        while(low < high)
        {
            while(low<high&&flag<=numbers[high])
                high--;
            numbers[low] = numbers[high];
            while(low<high&&flag>=numbers[low])
                low++;
            numbers[high] = numbers[low];
        }
        numbers[low] = flag;
        return low;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,32,312};
        MyUtils myUtils = new MyUtils();
        myUtils.quickSort(array,0,array.length-1);
    }

}
