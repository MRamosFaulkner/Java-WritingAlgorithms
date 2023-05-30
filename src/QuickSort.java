public class QuickSort {
    public static void quickSort(int[] arrayQS, int lowIndex, int highIndex ) {

        if  (lowIndex >= highIndex) {
            return;
        }

        int pivot = arrayQS[highIndex];

        int numsOnLeft = lowIndex;
        int numsOnRight = highIndex;

        //Partition moves all the numbers lower than the pivot to the left and all numbers higher to the right
        //This loop will swap numbers and brings the index towards each other
        //If numbers on the left is less than
        while (numsOnLeft < numsOnRight) {
            //The inner while loop walks the number from left to right -- also ends loop
            while (arrayQS[numsOnLeft] <= pivot && numsOnLeft < numsOnRight) {
                numsOnLeft++;
            }//This does the same for the numbers on the right to move to the left-- also ends loop
            while (arrayQS[numsOnRight] >= pivot && numsOnLeft < numsOnRight) {
                numsOnRight--;
            }
            swap(arrayQS, numsOnLeft, numsOnRight);

        }
        quickSort(arrayQS, lowIndex, numsOnLeft - 1);
        quickSort(arrayQS, numsOnLeft + 1, highIndex);
    }

    private static int partition(int[] arrayQS, int lowIndex, int highIndex) {
        int pivot = arrayQS[highIndex];
        int i = lowIndex - 1;

        for (int j = lowIndex; j < highIndex; j++) {
            if (arrayQS[j] < pivot) {
                i++;
                swap(arrayQS, i, j);
            }
        }

        swap(arrayQS, i + 1, highIndex);
        return i + 1;
    }

    //This is so numbers can swap
    private static void swap(int[] arrayQS, int index1, int index2) {
        int temp = arrayQS[index1];
        arrayQS[index1] = arrayQS[index2];
        arrayQS[index2] = temp;

    }

    public static void printArray(int[] arrayQS, int start, int end) {
//        for (int i = start; i <= end; i++) {
        for (int num : arrayQS) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
