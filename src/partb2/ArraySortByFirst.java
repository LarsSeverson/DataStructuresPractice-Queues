/**
 *
 * Part B.2
 * Please do not change any code in the main method 
 *
 */
package partb2;
public class ArraySortByFirst
{
	public static void sortByFirst(int data[][])
	{
		for(int i = 0; i < data.length-1; ++i){
			// get the smallest index to start sort from
			int x = getSmallestIndex(data, i, data.length);
			swap(data, i, x);
		}
	}
	public static int getSmallestIndex(int[][] data, int first, int last){
		// set smallest to first
		int smallest = first;
		for(int i = first; i < last; ++i){
			if(data[i][0] < data[smallest][0]){
				// change smallest if it is less than
				smallest = i;
			}
		}
		return smallest;
	}
	public static void swap(int[][] data, int swap, int swapee){
		for(int i = 0; i < data[0].length; ++i){
			int temp = data[swap][i];
			data[swap][i] = data[swapee][i];
			data[swapee][i] = temp;
		}
	}
	public static void display(int data[][])
	{
		for(int i = 0; i < data.length; i++) {
			System.out.print("\t ");
			for(int j = 0; j < data[i].length; j++){
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	} 

	//
	// Please do not change any code in the main method
	//
	public static void main(String args[])
	{
		int array[][] = {{1, 2, 3, 4, 5}, 
				 {3, 4, 5, 1, 2}, 
				 {5, 2, 3, 4, 1}, 
				 {2, 3, 1, 4, 5}, 
				 {4, 2, 3, 1, 5}};

		System.out.println("The array is initially " );
		display(array);
		System.out.println();

		sortByFirst(array);
		System.out.println("The array after sorting is " );
		display(array);
		System.out.println();
	}
}