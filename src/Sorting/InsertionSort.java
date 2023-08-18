package Sorting;
public class InsertionSort {
 public static int[] insertionsort(int[] arr){

        for(int i=1;i<arr.length;i++){

            int elem = arr[i];
            int j = i;

            while(j > 0 && arr[j-1]>elem) { // inserting elem
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = elem;
        }
        return arr;
    }
}
