import java.util.*;
public class bubbleSort {

    public static void printArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.err.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,0,3,6,4};
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}
