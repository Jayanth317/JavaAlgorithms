public class SortingAlgorithms {


    // Bubble sorting
    static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Selection Sorting
    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // Insertion sorting
    static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    // Merge Sorting
    public static int[] mergeSort(int arr[]) {
        int len = arr.length;
        if (len < 2)
            return arr;

        int midIndex = len / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[len - midIndex];

        for (int i = 0; i < midIndex; i++)
            leftHalf[i] = arr[i];
        for (int i = midIndex; i < len; i++)
            rightHalf[i - midIndex] = arr[i];

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(arr, leftHalf, rightHalf);

        return arr;
    }

    public static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    //Quick sorting
    public static int[] quickSort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex)
            return arr;
        int pivot = arr[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer)
                leftPointer++;
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer)
                leftPointer--;
            SwapWithIndex(arr, leftPointer, rightPointer);
        }
        SwapWithIndex(arr, leftPointer, highIndex);
        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
        return arr;
    }

    //The swap method for quickSorting
    public static void SwapWithIndex(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 34, 54, 23, 11, 10 };
        System.out.println("Given Array:");
        for (int a : arr)
            System.out.print(a + " ");
        System.out.println(" ");
        // -----------------------------------//
        int b[] = bubbleSort(arr);
        System.out.println("Bubble sorted Array");
        for (int e : b)
            System.out.print(e + " ");
        System.out.println(" ");
        // -----------------------------------//
        int c[] = selectionSort(arr);
        System.out.println("Selection sorted Array");
        for (int x : c)
            System.out.print(x + " ");
        System.out.println(" ");
        // -----------------------------------//
        int d[] = insertionSort(arr);
        System.out.println("Insertion sorted Array");
        for (int y : d)
            System.out.print(y + " ");
        System.out.println(" ");
        // -----------------------------------//
        int e[] = mergeSort(arr);
        System.out.println("Merge sorted Array");
        for (int f : e)
            System.out.print(f + " ");
        System.out.println(" ");
        // -----------------------------------//
        int f[] = quickSort(arr, 0, arr.length - 1);
        System.out.println("Quick sorted Array");
        for (int g : f)
            System.out.print(g + " ");
        System.out.println(" ");
    }
}
