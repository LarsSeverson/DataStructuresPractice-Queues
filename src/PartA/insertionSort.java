package PartA;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,7,9,6,2,8,3,1,5};
        display(arr);
        insertSort(arr, arr.length);
        display(arr);
    }
    private static void insertSort(int[] arr, int n){
        for( int i = 0 ;i < n ; i++ ) {
            int temp = arr[i];
            int j = i;
            while(j > 0 && temp < arr[j -1]) {
                arr[j] = arr[j-1];
                j--;
            }
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
