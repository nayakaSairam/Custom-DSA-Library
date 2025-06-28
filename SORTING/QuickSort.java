import java.util.Arrays;

public class QuickSort {
     public static void main(String[] args) {
        int[] arr={5,2,4,8,6,1};
        Quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static int partition(int[] arr,int low,int high){
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[high]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void Quicksort(int[] arr,int low,int high){
        if(low<high){
        int piv_indx=partition(arr,low,high);
        Quicksort(arr,low,piv_indx-1);
        Quicksort(arr,piv_indx+1,high);
    }
}

}
