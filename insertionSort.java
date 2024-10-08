public class insertionSort {

    public static void printArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.err.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        int arr[] = {11,1,2,5,3,6,4,10,0};
        
        for(int i =1; i<arr.length; i++){
            int j = i-1;
            int current = arr[i];
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }
}