package com.epam.rd.autotasks;

import java.util.*;
import java.util.stream.Collectors;

class CycleSwap {

    static void cycleSwap(int[] array) {
        if(array.length==0) return;

        int cycledElement = array[array.length-1];

        System.arraycopy(array, 0, array, 1, array.length - 1);

        array[0] = cycledElement;
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

