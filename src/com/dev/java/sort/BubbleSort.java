package com.dev.java.sort;

import java.util.List;

/**
 * Created by chris on 02/10/2016.
 */
public class BubbleSort implements Sort {
    @Override
    public List<Integer> ascent(List<Integer> dataList) {
        for (int i = 0; i < dataList.size() - 1; i++) {
            for (int j = 0; j < dataList.size() - i - 1; j++) {
                swapData(dataList, j + 1, j);
            }
        }
        return dataList;
    }

    @Override
    public List<Integer> descent(List<Integer> dataList) {
        for (int i = 0; i < dataList.size() - 1; i++) {
            for (int j = 0; j < dataList.size() - i - 1; j++) {
                swapData(dataList, j, j + 1);
            }
        }
        return dataList;
    }

    private List<Integer> swapData(List<Integer> dataList, int i, int j) {
        if (dataList.get(i).compareTo(dataList.get(j)) < 0) {
            int temp = dataList.get(i);
            dataList.set(i, dataList.get(j));
            dataList.set(j, temp);
        }
        return dataList;
    }
}
