package com.dev.java.sort;

import java.util.List;

import static com.dev.java.utils.ListUtil.swapData;

/**
 * Created by chris on 02/10/2016.
 */
public class BubbleSort implements Sort {
    @Override
    public List<Integer> ascent(List<Integer> dataList) {
        return sort(dataList, true);
    }

    @Override
    public List<Integer> descent(List<Integer> dataList) {
        return sort(dataList, false);
    }

    @Override
    public List<Integer> sort(List<Integer> dataList, boolean isAscent) {
        for (int i = 0; i < dataList.size() - 1; i++) {
            for (int j = 0; j < dataList.size() - i - 1; j++) {
                if (isAscent) {
                    swapData(dataList, j + 1, j);
                } else {
                    swapData(dataList, j, j + 1);
                }
            }
        }
        return dataList;
    }
}
