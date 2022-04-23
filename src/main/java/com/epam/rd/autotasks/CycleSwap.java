package com.epam.rd.autotasks;

import java.util.*;

class CycleSwap {

    static void cycleSwap(int[] array) {
        if(array.length==0) return;

        int [] temp = new int[array.length];
        temp[0] = array[array.length-1];
        System.arraycopy(array, 0, temp, 1, array.length - 1);
        System.arraycopy(temp, 0, array, 0, array.length);
    }

        static void cycleSwap(int[] array, int shift){
            if(shift==array.length || array.length==0) return;

            List<Integer> result = new ArrayList<>();

            Arrays.stream(array).boxed().skip(array.length-shift).forEach(result::add);
            Arrays.stream(array).boxed().limit(array.length-shift).forEach(result::add);

            for(int i = 0; i< array.length; i++){
                array[i] = result.get(i);
            }
        }

    }

