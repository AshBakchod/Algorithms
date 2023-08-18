package Sorting;
public class SelectionSort {
   public static int[] selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    arr[j]=arr[i];
                    arr[i]=min;

                }
            }
        }
        return arr;
    }
}
