package edu.osu.cs362;

import java.util.Scanner;

/**
 * This class implements MergeSort
 * @author Unknown
 *
 */
public class MergeSort {
	/** Array for mergeSort*/
    private int[] array;
    /** Temp Merge Array*/
    private int[] tempMergArr;
    /** Length of the array*/
    private int length;

    /**
     * Sorts inputArr with merge sort algorithm
     *
     * @param inputArr Array to be sorted
     */
    public final void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[this.length];
        this.mergeSort(0, this.length - 1);
    }

    /**
     * Partitions Array into recursively smaller pieces
     *
     * @param lowerIndex lower bound to include in the first partition
     * @param higherIndex upper bound to include in the third partition
     */
    private void mergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            this.mergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            this.mergeSort(middle , higherIndex);
            // Now merge both sides
            this.mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    /**
     * Merges partitions
     *
     * @param lowerIndex The lower index
     * @param middle The middle index
     * @param higherIndex The higher index
     */
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            this.tempMergArr[i] = this.array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (this.tempMergArr[i] <= this.tempMergArr[j]) {
                this.array[k] = this.tempMergArr[i];
                i++;
            } else {
                this.array[k] = this.tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            this.array[k] = this.tempMergArr[i];
            k++;
            i++;
        }

    }

    /**
     * Gets input to sort
     *
     * @return unsorted array of integers to sort
     */
   public static int[] getInput() {
        final int numElements = 6;
        int[] unsorted = new int[numElements];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any 6 Numbers for Unsorted Array : ");
        for (int i = 0; i < numElements; i++) {
            unsorted[i] = input.nextInt();
        }
        input.close();
        return unsorted;
    }

    /**
     * Main Method
     *
     * @param args Command line arguments
     */
    public static void main(String args[]) {
        int[] inputArr = getInput();
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(inputArr);
        for (int i : inputArr) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
