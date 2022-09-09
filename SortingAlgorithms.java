public class SortingAlgorithms {

    //Bubble sorting
    static int[] bubbleSort(int[] arr){
        for(int i = 0 ;i < arr.length-1;i++){
            for(int j = 0;j < arr.length-i-1;j++){
                if(arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    //Selection Sorting
    static int[] selectionSort(int[] arr){
        for(int i = 0 ;i< arr.length-1;i++){
            int min = i;
            for(int j = i+1; j< arr.length;j++){
                if(arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    //Insertion sorting
    static int[] insertionSort(int[] arr){
        for(int i = 1; i< arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while( j>= 0 && current <arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {7,8,34,54,23,11,10};
        System.out.println("Given Array:");
        for(int a: arr)
            System.out.print(a + " ");
        System.out.println(" ");    
        //-----------------------------------//
        int b[] = bubbleSort(arr);
        System.out.println("Bubble sorted Array");    
        for(int e: b)
            System.out.print(e+" ");
        System.out.println(" ");    
        //-----------------------------------//
        int c[] = selectionSort(arr);
        System.out.println("Selection sorted Array");    
        for(int x: c)
            System.out.print(x + " ");
        System.out.println(" ");    
        //-----------------------------------//
        int d[] = insertionSort(arr);
        System.out.println("Insertion sorted Array");    
        for(int y: d)
            System.out.print(y + " ");
        System.out.println(" ");    
    
    
    }
}
