package PartA;

// Big index
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,7,9,6,2,8,3,1,5};
        display(arr);
        selectionSort(arr, arr.length);
        display(arr);
    }
    private static void selectionSort(int[] arr, int n){
        for(int i =0; i < n -1; i++){
            int bigIndex = 0;
            for(int j = 1; j < n-i; j++){
                if(arr[j] > arr[bigIndex]){
                    bigIndex = j;
                }
            }
            swap(arr, bigIndex, n-i-1);
        }
    }
    public static void display(int[] arr){
        System.out.println();
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void swap(int[] arr,int big, int last){
        int temp = arr[big];
        arr[big] = arr[last];
        arr[last] = temp;
    }
}
