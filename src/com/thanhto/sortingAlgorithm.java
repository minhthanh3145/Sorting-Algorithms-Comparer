package com.thanhto;

public abstract class sortingAlgorithm {
    int[]arr;

    sortingAlgorithm(int[]arr){
        this.arr = arr;
    }

    abstract void sort();

    void display(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
