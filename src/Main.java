import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] array = {4, 1, 3, 9, 7};
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arrayQS = {4, 1, 3, 9, 7};

        System.out.println("BUBBLE SORT");
        System.out.println("Before:");
        BubbleSort.printArray(array);

        BubbleSort.sort(array, array.length);
        System.out.println("After:");
        BubbleSort.printArray(array);

        System.out.println("QUICK SORT");
        System.out.println("Before:");
        QuickSort.printArray(arrayQS, 0, arrayQS.length-1);

        System.out.println("After: ");
        QuickSort.quickSort(arrayQS, 0, arrayQS.length - 1);
        QuickSort.printArray(arrayQS, 0, arrayQS.length-1);


//        QuickSort.quickSort(arrayQS, lowIndex, numsOnLeft - 1);
//        QuickSort.quickSort(arrayQS, lowIndex + 1, highIndex);
    }

}