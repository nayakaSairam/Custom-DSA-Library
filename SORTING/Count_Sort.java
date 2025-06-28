import java.util.Arrays;

public class Count_Sort {

    public static void main(String[] args) {
        int[] arr={4,5,6,2,3,1};
        count_sort(arr);
        System.out.println(Arrays.toString(arr));
    }   
    public static void count_sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int crct_indx=arr[i]-1;
            if(arr[i]!=arr[crct_indx]){
                int temp=arr[i];
                arr[i]=arr[crct_indx];
                arr[crct_indx]=temp;
            }
            else{
                i++;
            }
        }
    }
}
