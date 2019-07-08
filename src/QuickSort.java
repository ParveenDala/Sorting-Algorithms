/******
 * Parveen Dala
 * Quick sort, Sorting Algorithms
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {50, 34, 95, 12, 49, 76, 82, 4};
        print(arr);
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] <= arr[end]) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
