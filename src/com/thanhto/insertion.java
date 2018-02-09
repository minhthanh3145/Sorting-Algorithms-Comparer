package com.thanhto;

public class insertion extends sortingAlgorithm {
    int[]arr;

    insertion(int[]arr){
        super(arr);
        this.arr = arr;
    }

    void sort(){
        int i, key, j;

        for( i=1; i<arr.length;i++){
            key = arr[i];
            j = i - 1;

            while(j>=0 && arr[j] > arr[i]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
