package com.dev.java;

import com.dev.java.sort.BubbleSort;
import com.dev.java.sort.Sort;
import com.dev.java.utils.RandNumUtil;

import java.util.List;

/**
 * Sort comparision
 */
public class Main {
    public static void main(String[] args) {
        RandNumUtil randNumUtil = new RandNumUtil();
        List<Integer> dataList = randNumUtil.getRandomList();

        System.out.println("============== Original List ============== ");
        for (int data : dataList) {
            System.out.print(data);
        }

        System.out.println("\n============== Sorted List (Ascent) ============== ");
        Sort sort = new BubbleSort();

        dataList = sort.ascent(dataList);

        for (int data : dataList) {
            System.out.print(data);
        }

        System.out.println("\n============== Sorted List (Descent) ============== ");

        dataList = sort.descent(dataList);

        for (int data : dataList) {
            System.out.print(data);
        }

        System.out.println("\n============== Sorted List (Optimized Ascent) ============== ");

        dataList = sort.optimizedAscent(dataList);

        for (int data : dataList) {
            System.out.print(data);
        }

        System.out.println("\n============== Sorted List (Optimized Descent) ============== ");

        dataList = sort.optimizedDescent(dataList);

        for (int data : dataList) {
            System.out.print(data);
        }
    }
}
