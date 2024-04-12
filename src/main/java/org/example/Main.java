package org.example;

import java.io.*;
import java.util.*;

class Result {

    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);

        int middleIndex = arr.size() / 2;
        int median;

        if (arr.size() % 2 == 1) {
            median = arr.get(middleIndex);
        } else {
            median = (arr.get(middleIndex - 1) + arr.get(middleIndex)) / 2;
        }

        return median;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();
        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = Result.findMedian(arr);

        System.out.println(result);

        bufferedReader.close();
    }
}
