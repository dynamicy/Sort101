package com.dev.java.utils;

import java.util.List;

/**
 * This class manipulates the list
 */
public class ListUtil {

    /**
     * Swap items in the list
     *
     * @param dataList
     * @param i
     * @param j
     * @return
     */
    public static List<Integer> swapData(List<Integer> dataList, int i, int j) {
        if (dataList.get(i).compareTo(dataList.get(j)) < 0) {
            int temp = dataList.get(i);
            dataList.set(i, dataList.get(j));
            dataList.set(j, temp);
        }
        return dataList;
    }
}
