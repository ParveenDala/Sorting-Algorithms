/******
 * Parveen Dala
 * Bubble sort, Sorting Algorithms
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {50, 34, 95, 12, 49, 76, 82, 4};
        print(arr);
        sort(arr);
        print(arr);
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
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
