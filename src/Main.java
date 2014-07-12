/**
 * Created with IntelliJ IDEA.
 * User: Zhiyi Yang
 * Date: 5/01/14
 * Time: 10:14 PM
 */
public class Main {
    public static void main(String[] args) {

        int[] array = {3,4,2,5,1};

        int[] sorted = QuickSort.quickSort(array);

        printArray(sorted);

    }

    private static void printArray(int[] sorted) {
        for (int i: sorted) {
            System.out.print(i+", ");
        }
    }
}
