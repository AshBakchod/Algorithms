package Sorting;
public class QuickSort {
   public static void quicksort(int[] arr , int strt , int end){
        if(strt>=end){
            return;
        }
        int pivot = arr[(strt+end+1)/2];
        int i=strt,j=end;

        while(i<=j){
           if(arr[j]<pivot && pivot>arr[i]){
                i++;
                continue;
           }else if (arr[j]>pivot && pivot<arr[i]) {
               j--;
               continue;
           }else if(arr[j]<=pivot && pivot<=arr[i]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j--;
                continue;
           }
           i++;
           j--;
        }
       int mid = BinarySearch.binarysearch(arr,pivot);
        quicksort(arr,strt,mid-1);
        quicksort(arr,mid+1,end);
    }
}
