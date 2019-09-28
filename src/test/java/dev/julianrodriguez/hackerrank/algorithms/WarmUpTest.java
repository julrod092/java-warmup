package dev.julianrodriguez.hackerrank.algorithms;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;


class WarmUpTest {

    private WarmUp warmUp = new WarmUp();

    @Test
    void solveMeFirstTest() {
        assertEquals(2, warmUp.solveMeFirst(1, 1));
        assertEquals(5, warmUp.solveMeFirst(3, 2));
        assertEquals(100, warmUp.solveMeFirst(85, 15));
    }

    @Test
    void plusMinus() {

        int[] array1 = new int[]{1, 0, -1};

        HashMap<String, Integer> result1 = warmUp.plusMinus(array1);

        assertEquals(0.3333333333333333, (double)result1.get("positive") / (double)array1.length);
        assertEquals(0.3333333333333333, (double)result1.get("negative") / (double)array1.length);
        assertEquals(0.3333333333333333, (double)result1.get("zero") / (double)array1.length);


        int[] array2 = new int[]{4, 1, -4, -5, 12, 0, 0, 1, 0, -1};

        HashMap<String, Integer> result2 = warmUp.plusMinus(array2);

        assertEquals(0.4, (double)result2.get("positive") / (double)array2.length);
        assertEquals(0.3, (double)result2.get("negative") / (double)array2.length);
        assertEquals(0.3, (double)result2.get("zero") / (double)array2.length);
    }

    @Test
    void staircase() {
        warmUp.staircase(6);
    }
}
