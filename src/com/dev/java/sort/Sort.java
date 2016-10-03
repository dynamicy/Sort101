package com.dev.java.sort;

import java.util.List;

/**
 * Sort
 */
public interface Sort {

    public List<Integer> ascent(List<Integer> dataList);

    public List<Integer> descent(List<Integer> dataList);

    public List<Integer> optimizedAscent(List<Integer> dataList);

    public List<Integer> optimizedDescent(List<Integer> dataList);
}
