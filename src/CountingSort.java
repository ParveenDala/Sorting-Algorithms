public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {50, 34, 95, 12, 49, 76, 82, 4};
//        int[] arr = {9, 8, 2, 1, 0, 10, 3, 2, 1, 4, 9, 9, 9};
        print(arr);
        countingSort(arr, 4, 95);
        print(arr);
    }

    private static void countingSort(int[] arr, int min, int max) {
        int[] bucket = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i] - min] = bucket[arr[i] - min] + 1;
        }
        int k = 0;
        for (int i = 0; i < bucket.length; i++) {
            int val = bucket[i];
            for (int j = 0; j < val; j++) {
                arr[k] = i + min;
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
