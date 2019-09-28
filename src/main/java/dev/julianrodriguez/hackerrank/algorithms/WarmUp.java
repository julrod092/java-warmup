package dev.julianrodriguez.hackerrank.algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class WarmUp {

    public WarmUp () {}

    public int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        return a + b;
    }

    public HashMap<String, Integer> plusMinus(int[] arr) {
        HashMap<String, Integer> countMap = new HashMap<String, Integer>();
        countMap.put("positive", 0);
        countMap.put("negative", 0);
        countMap.put("zero", 0);

        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] >= 1) {
                countMap.put("positive", countMap.get("positive") + 1);
            } else if (arr[i] <= -1) {
                countMap.put("negative", countMap.get("negative") + 1);
            } else {
                countMap.put("zero", countMap.get("zero") + 1);
            }
        }

        return countMap;
    }

    public void staircase(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(j < n - i ? " " : "#");
            }
            System.out.println("");
        }
    }

}
