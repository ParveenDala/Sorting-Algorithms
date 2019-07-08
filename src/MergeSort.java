/******
 * Parveen Dala
 * Merge sort, Sorting Algorithms
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {50, 34, 95, 12, 49, 76, 82, 4};
        print(arr);
        merge(arr, 0, arr.length - 1);
        print(arr);
    }

    private static void merge(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            merge(arr, start, mid);
            merge(arr, mid + 1, end);
            sort(arr, start, mid, end);
        }
    }

    private static void sort(int[] arr, int start, int mid, int end) {

        int[] left = new int[mid + 1];
        int[] right = new int[end - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[i + mid + 1];
        }

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        if (i >= left.length) {
            while (j < right.length) {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        if (j >= right.length) {
            while (i < left.length) {
                arr[k] = left[i];
                i++;
                k++;
            }

        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
