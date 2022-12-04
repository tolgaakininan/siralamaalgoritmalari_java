public class Main {
    public static void main(String[] args) {
        int[] arr={1,3,4,4,2,3,1,5,6,9};
        CountingSort(arr,1,9);
        for(int num:arr)
        {
            System.out.println(num);
        }
    }
    public static void CountingSort(int[] arr,int min,int max)
    {
        int[] tempArr=new int[max-min+1];
        for(int num:arr)
        {
            tempArr[num-min]++;
        }
        int j=0;
        for(int i=min;i<=max;i++)
        {
            while(tempArr[i-min]>0)
            {
                arr[j++]=i;
                tempArr[i-min]--;
            }
        }
    }
}
