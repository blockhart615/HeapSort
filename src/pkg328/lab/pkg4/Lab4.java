package pkg328.lab.pkg4;

import java.util.Random;
import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
//	DECLARATIONS
	int n = 10000, numLoops = 30;
	double timeAvg = 0;
	int[] arr = new int[n];
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	HeapSorter sorter = new HeapSorter();

//	populate arraylist with n numbers between -7000 and 7000
	for (int i = 0; i < n; i++) {
	    arr[i] = 7000 - rand.nextInt(14000);
	}

//	call heap sort function and get time
	for (int i = 0; i < numLoops; i++) {
	    double timer = System.nanoTime();
	    arr = sorter.heapSort(arr);
	    timer = System.nanoTime() - timer;
	    timeAvg += timer;
	}
	timeAvg = timeAvg / numLoops / 1000000;

	System.out.println("Average time to perform HeapSort = " + timeAvg + " ms");

//	display sorted array
//	System.out.println("HEAP SORTED ARRAY:");
//	for (int i = 0; i < n; i++) {
//	    System.out.print(arr[i] + " ");
//	}
    }

}
