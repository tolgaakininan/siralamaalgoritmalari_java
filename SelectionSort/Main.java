public class Main {
    public static void main(String[] args) {
        int[] arr={33,432,12,3,4,-5,-22};
        SelectionSort(arr);
        for(int num:arr)
        {
            System.out.println(num);
        }
    }
    public static void SelectionSort(int[] arr)
    {
        int len=arr.length;
        for(int lui=len-1;lui>0;lui--)
        {
            int largest=0;
            for(int j=1;j<=lui;j++)
            {
                if(arr[j]>arr[largest])
                {
                    largest=j;
                }
            }
            if(largest!=lui) {
                arr[largest] += arr[lui];
                arr[lui] = arr[largest] - arr[lui];
                arr[largest] -= arr[lui];
            }
        }
    }
}
