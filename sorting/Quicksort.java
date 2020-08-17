package sorting;

import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {
        int[] arrayOfIntegers = {14,2,20,39,41,28,4,23,9,22};
        int size = arrayOfIntegers.length;
        System.out.println("Before: " + Arrays.toString(arrayOfIntegers));
        sorting(arrayOfIntegers, 0, size - 1);
        System.out.println("After: " + Arrays.toString(arrayOfIntegers));
    }

    public static void sorting(int[] arrayOfIntegers, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(arrayOfIntegers, start, end);

            sorting(arrayOfIntegers, start, partitionIndex - 1); //sort the left
            sorting(arrayOfIntegers, partitionIndex + 1, end); //sort the right
        }
    }

    public static int partition(int[] arrayOfIntegers, int start, int end) {
        int marker = arrayOfIntegers[end];
        int preMarkerIndex = start - 1;

        for (int i = start; i < end; i++) {
            if (arrayOfIntegers[i] < marker) {
                preMarkerIndex++;
                if (i != preMarkerIndex) {
                    swap(arrayOfIntegers, preMarkerIndex, i);
                }
            }
        }
        swap(arrayOfIntegers, preMarkerIndex + 1, end);
        return preMarkerIndex + 1;
    }

    public static void swap(int[] arrayOfInt, int x, int y) {
        int temp = arrayOfInt[x];
        arrayOfInt[x] = arrayOfInt[y];
        arrayOfInt[y] = temp;
    }
}