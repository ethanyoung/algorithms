/**
 * Created with IntelliJ IDEA.
 * User: Zhiyi Yang
 * Date: 5/01/14
 * Time: 10:14 PM
 */
public class QuickSort {
    public static int[] quickSort (int[] array) {
        inPlaceQuickSort(array, 0, array.length-1);
        return array;
    }

    /**
     * In-place quick-sort modifies the input sequence using element swapping
     * and does not explicitly create sub-sequences.
     */
    private static void inPlaceQuickSort(int[] array, int a, int b) {

        /* No need to sort. */
        if (a >= b) {
            return;
        }

        int index = partition(array, a, b);
        inPlaceQuickSort(array, a, index-1);
        inPlaceQuickSort(array, index+1, b);
    }

    private static int partition(int[] array, int a, int b) {

        int pivot = array[b];
        int left = a;           // Will scan rightward.
        int right = b-1;        // Will scan leftward.

        while (left <= right) {
            /* Find an element larger than the pivot. */
            while (left <= right && array[left] <= pivot) {
                left++;
            }
            /* Find an element smaller than the pivot. */
            while (right >= left && array[right] >= pivot) {
                right--;
            }
            if (left < right) {
                swap(array, left, right);
            }
        }

        /* Lastly put the pivot into its final place. */
        swap(array, left, b);

        /* This is the index of the pivot. */
        return left;

    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
