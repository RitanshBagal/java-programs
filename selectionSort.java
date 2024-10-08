public class selectionSort {

    public static void printArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.err.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {11,1,2,5,3,6,4,10,0};
        
        for(int i=0; i<arr.length; i++){
            int smallest = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
