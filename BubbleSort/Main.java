public class Main {
    public static void main(String[] args) {
        int[] arr = {33, 432, 12, 3, 4, -5, 342, 33, -22};
        BubbleSort(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }
    public static void BubbleSort(int[] arr)
    {
        int len=arr.length;
        for(int i=0;i<len-1;i++)
        {
            for(int j=0;j<len-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    arr[j]+=arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]-=arr[j+1];
                }
            }
        }
    }
}
