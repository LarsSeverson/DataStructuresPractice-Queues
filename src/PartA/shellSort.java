package PartA;

public class shellSort {
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,7,9,6,2,8,3,1,5};
        display(arr);
        shellSort(arr, arr.length);
        display(arr);
    }
    private static void shellSort(int[] arr, int n){
        // make a gap
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                // add compare value
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap){
                    arr[j] = arr[j - gap];
                }
                // go to original
                arr[j] = temp;
            }
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
