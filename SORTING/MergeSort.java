import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        mergesort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergesort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid= start+((end-start)/2);
        mergesort(arr, start, mid);
        mergesort(arr, mid+1, end);
        merge(arr,start,end,mid);
    }
    public static void merge(int[] arr,int start,int end,int mid){
        int i=start;int j=mid+1;int k=0;
        int[] mix= new int[end-start+1];
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                mix[k++]=arr[i++];
            }else{
                mix[k++]=arr[j++];
            }
        }
        while(i<=mid){
            mix[k++]=arr[i++];
        }
        while(j<=end){
            mix[k++]=arr[j++];
        }
        for(int z=start,l=0;z<=end;z++,l++){
            arr[z]=mix[l];
        }
    }


    public static int[] MergeSortUsingExtraArray(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=MergeSortUsingExtraArray(Arrays.copyOfRange(arr, 0, mid));
        int[] right=MergeSortUsingExtraArray(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
   
    public static int[] merge(int[] left,int[] right){
        int i=0;
        int j=0;
        int k=0;
        int[] arr=new int[left.length+right.length];
      
      while(i<left.length && j<right.length){
        if(left[i]<right[j]){
            arr[k++]=left[i++];
        }
        else{
            arr[k++]=right[j++];
        }
      }
        while(i<left.length){
            arr[k++]=left[i++];
        }
        while(j<right.length){
            arr[k++]=right[j++];
        }
        return arr;
    }
}
