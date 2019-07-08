/******
 * Parveen Dala
 * Insertion sort, Sorting Algorithms
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {50, 34, 95, 12, 49, 76, 82, 4};
        print(arr);
        sort(arr);
        print(arr);
    }

    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int j = i - 1;
            while ((j >= 0) && (arr[j] > element)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = element;
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
