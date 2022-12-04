public class Main {
    public static void main(String[] args) {
        int[] arr={33,432,12,3,4,-5,342,33,-22};
        MergeSort(arr,0,arr.length);
        for(int num:arr)
        {
            System.out.println(num);
        }
    }
    public static void MergeSort(int[] arr,int start,int end)
    {
        if(end-start<2)
        {
            return;
        }
        int mid=(start+end)/2;
        MergeSort(arr,start,mid);
        MergeSort(arr,mid,end);
        merge(arr,start,mid,end);
    }
    public static void merge(int[]arr,int start,int mid,int end)
    {
        if(arr[mid-1]<=arr[mid])
        {
            return;
        }
        int i=start;
        int j=mid;
        int index=0;
        int[] temparr=new int[end-start];

        while(i<mid&&j<end)
        {
            temparr[index++]=arr[i]<=arr[j]?arr[i++]:arr[j++];
        }
        System.arraycopy(arr,i,arr,start+index,mid-i);
        System.arraycopy(temparr,0,arr,start,index);

    }
}
