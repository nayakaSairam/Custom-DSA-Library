import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr={4,3,1,2,5};
        selection_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection_Sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int max=0;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            int temp=arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[max];
            arr[max]=temp;
        }
    }
}
