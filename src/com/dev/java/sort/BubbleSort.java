package com.dev.java.sort;

import java.util.List;

import static com.dev.java.utils.ListUtil.swapData;

/**
 * The implementation of bubble sort
 */
public class BubbleSort implements Sort {

    @Override
    public List<Integer> ascent(List<Integer> dataList) {
        for (int i = 0; i < dataList.size() - 1; i++) {
            for (int j = 0; j < dataList.size() - i - 1; j++) {
                if (dataList.get(j).compareTo(dataList.get(j + 1)) > 0) {
                    swapData(dataList, j, j + 1);
                }
            }
        }
        return dataList;
    }

    @Override
    public List<Integer> descent(List<Integer> dataList) {
        for (int i = 0; i < dataList.size() - 1; i++) {
            for (int j = 0; j < dataList.size() - i - 1; j++) {
                if (dataList.get(j).compareTo(dataList.get(j + 1)) < 0) {
                    swapData(dataList, j, j + 1);
                }
            }
        }
        return dataList;
    }

    @Override
    public List<Integer> optimizedAscent(List<Integer> dataList) {
        for (int i = 0; i < dataList.size() - 1; i++) {
            for (int j = 0; j < dataList.size() - i - 1; j++) {
                int n = j + 1;
                if (dataList.get(j).compareTo(dataList.get(j + 1)) < 0) {
                    n++;
                } else {
                    swapData(dataList, n, j);
                }
            }
        }
        return dataList;
    }

    @Override
    public List<Integer> optimizedDescent(List<Integer> dataList) {
        for (int i = 0; i < dataList.size() - 1; i++) {
            for (int j = 0; j < dataList.size() - i - 1; j++) {
                int n = j + 1;
                if (dataList.get(j).compareTo(dataList.get(j + 1)) > 0) {
                    n++;
                } else {
                    swapData(dataList, n, j);
                }
            }
        }
        return dataList;
    }
}
