package com.dev.java;

import com.dev.java.sort.BubbleSort;
import com.dev.java.sort.CountSort;
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

        List<Integer> dataList1 = randNumUtil.getRandomList();

        System.out.println("============== Original List ============== ");
        for (int data : dataList1) {
            System.out.print(data);
        }

        System.out.println("\n============== Sorted List (Optimized Descent) ============== ");

        CountSort countSort = new CountSort();

        Integer[] intArray = new Integer[dataList1.size()];
        intArray = dataList1.toArray(intArray);

        int max = countSort.getMax(intArray);
        countSort.countSort(intArray, max);
    }
}
