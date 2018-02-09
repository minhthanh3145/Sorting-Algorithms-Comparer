package com.thanhto;

import java.util.Random;

public class arrayGenerator {
    int size;
    arrayGenerator(int size){
        this.size = size;
    }
    int[] generate(){
        Random random = new Random();
        return random.ints(this.size, 0, 1000).toArray();
    }
}
