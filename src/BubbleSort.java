public class BubbleSort {
    public static void sort(int[] array, int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array [j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.println(num + " ");
        }
        System.out.println();
    }



//    private void swapNumbers()




}
