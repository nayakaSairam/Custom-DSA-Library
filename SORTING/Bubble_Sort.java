import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,7,5,3,1};
        bubble_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble_Sort(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; 
                }
            }
        }
    }
}
