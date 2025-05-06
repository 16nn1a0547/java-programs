import java.util.Arrays;

public class TestParallelSort {
	public static void main(String args[]) {
		int[] arr1 = {25,31,52,12,80,7,45,71,2,10,};
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		int[] arr3 = Arrays.copyOf(arr1, arr1.length);

		System.out.println("Original Array ..");
		Arrays.stream(arr1).forEach(n -> System.out.print(n + " "));
		System.out.println();
		//Using Parallel Sort
		long s = System.currentTimeMillis();
		Arrays.parallelSort(arr1);
		long e = System.currentTimeMillis();
		System.out.println("Time Taken for ParallelSort " + (e-s));


		//Using Arrays Sort
		long s1 = System.currentTimeMillis();
		Arrays.sort(arr3);
		long e1 = System.currentTimeMillis();
		System.out.println("Time Taken for sort " + (e1-s1));

		

		System.out.println();
		System.out.println("After Sorting..");
		for(int n : arr1) {
			System.out.print(n + " ");
		}

		System.out.println("\n Array2 after sorting ...");
		Arrays.parallelSort(arr2, 2,5);
		Arrays.stream(arr2).forEach(n -> System.out.print(n + " "));
	}
}