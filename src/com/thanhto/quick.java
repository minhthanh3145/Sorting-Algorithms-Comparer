package com.thanhto;

public class quick extends sortingAlgorithm{
    int[]arr;

    quick(int[]arr){
        super(arr);
        this.arr = arr;
    }

    void sort(){
        innerSort(arr,0,arr.length-1);
    }

    int partition(int arr[], int low, int high){

        int pivot = arr[high];
        int i = (low - 1);
        for(int j= low; j<high;j++){
            if(arr[j] <= pivot){
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        int tmp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = tmp;

        return i+1;
    }

    void innerSort(int arr[], int low, int high){
        if(high - low < 2 ) {
            int p = partition(arr,low,high);

            innerSort(arr, low, p - 1);
            innerSort(arr, p + 1, high);

        }
    }
}
