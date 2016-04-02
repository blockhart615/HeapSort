package pkg328.lab.pkg4;

import java.util.Arrays;

public class HeapSorter {

    /**
     * Max Heapify Function
     *
     * @param arr - array that is passed in
     * @param i - index that is being max heapified
     * @return - the new array
     */
    public int[] maxHeapify(int[] arr, int i) {
	int maxIndex = i, leftIndex = (2 * i + 1), rightIndex = (2 * i + 2);

	//if left child exists AND greater than its parent
	if (leftIndex < arr.length && arr[leftIndex] > arr[maxIndex]) {
	    maxIndex = leftIndex;
	}
	//if right child exists AND greater than its parent
	if (rightIndex < arr.length && arr[rightIndex] > arr[maxIndex]) {
	    maxIndex = rightIndex;
	}
	//if the max index isn't i, it needs to be swapped
	if (maxIndex != i) {
	    int temp = arr[maxIndex];
	    arr[maxIndex] = arr[i];
	    arr[i] = temp;
	    maxHeapify(arr, maxIndex);
	}
	return arr;
    }

    /**
     * Build Max Heap
     *
     * @param arr - array that is to be turned into a max heap
     * @return the new array
     */
    public int[] buildMaxHeap(int[] arr) {
	for (int i = arr.length - 1; i >= 0; i--) {
	    maxHeapify(arr, i);
	}
	return arr;
    }

    /**
     * Perform Heap Sort
     *
     * @param arr - array to be sorted
     * @return - the heap sorted array
     */
    public int[] heapSort(int[] arr) {
	int[] newArr = new int[arr.length];

	int j = 1;
	for (int i = newArr.length - 1; i >= 0; i--) {
	    buildMaxHeap(arr);
	    newArr[newArr.length - j] = arr[0];
	    arr = Arrays.copyOfRange(arr, 1, arr.length);
	    maxHeapify(arr, i);
	    j++;
	}
	return newArr;
    }

}
