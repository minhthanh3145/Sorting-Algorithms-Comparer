package com.thanhto;

public class Main {

    public static void main(String[] args) {

        long[][] runTimeMap = new long[4][20];

        long startTime, endTime, totalTime;
        for(int i = 1000; i<= 20000; i = i+1000){

            arrayGenerator generator = new arrayGenerator(i);

            int[] arr = generator.generate();

            sortingAlgorithm Interchange = new interchange(arr);
            startTime = System.nanoTime();
            Interchange.sort();
            Interchange.display();
            endTime = System.nanoTime();
            totalTime = endTime - startTime;
            runTimeMap[0][ (i/1000) - 1] = totalTime;

            sortingAlgorithm Insertion = new insertion(arr);
            startTime = System.nanoTime();
            Insertion.sort();
            Insertion.display();
            endTime = System.nanoTime();
            totalTime = endTime - startTime;
            runTimeMap[1][ (i/1000) - 1] = totalTime;

            sortingAlgorithm Quick = new quick(arr);
            startTime = System.nanoTime();
            Quick.sort();
            Quick.display();
            endTime = System.nanoTime();
            totalTime = endTime - startTime;
            runTimeMap[2][ (i/1000) - 1] = totalTime;

            sortingAlgorithm Radix = new radix(arr);
            startTime = System.nanoTime();
            Radix.sort();
            Radix.display();
            endTime = System.nanoTime();
            totalTime = endTime - startTime;
            runTimeMap[3][ (i/1000) - 1] = totalTime;
        }

        excelWriter writer = new excelWriter(runTimeMap);
        writer.write();
    }




}
