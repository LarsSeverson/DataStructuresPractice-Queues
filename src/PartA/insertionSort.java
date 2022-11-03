package PartA;

// insertion sort algorithm
public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,7,9,6,2,8,3,1,5};
        display(arr);
        insertSort(arr, arr.length);
        display(arr);
    }
    private static void insertSort(int[] arr, int n){
        // for each entry in the array
        for( int i = 0 ;i < n ; i++ ) {
            // set temp to arr[i]
            int temp = arr[i];
            // set j = i
            int j = i;
            // move j into the while loop iterating down
            while(j > 0 && temp < arr[j -1]) {
                arr[j] = arr[j-1];
                j--;
            }
            // set arr[j] to temp
            arr[j] = temp;
        }
    }
    public static void display(int[] arr){
        System.out.println();
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
