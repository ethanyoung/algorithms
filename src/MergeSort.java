/**
 * Created with IntelliJ IDEA.
 * User: Zhiyi Yang
 * Date: 5/01/14
 * Time: 10:14 PM
 */
public class MergeSort {
    public static int[] mergeSort(int[] array) {

        if (array.length <= 1) {
            return array;
        }

        int mid = array.length/2;

        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, mid, right, 0, right.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);

    }

    /**
     * Merge two sorted arrays. Most of work done here.
     * @param left
     * @param right
     * @return
     */
    private static int[] merge(int[] left, int[] right) {

        int[] merged = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j< right.length) {

            if (left[i] <= right[j]) {
                merged[k] = left[i];
                i++;
            }
            else {
                merged[k] = right[j];
                j++;
            }

            k++;
        }

        while (i < left.length) {

            merged[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            merged[k] = right[j];
            j++;
            k++;
        }

        return merged;
    }


}
