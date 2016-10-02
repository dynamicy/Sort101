package com.dev.java.utils;

import java.util.List;

/**
 * Created by chris on 03/10/2016.
 */
public interface RandNum {
    public List<Integer> getRandomList();
    public List<Integer> getRandomList(int size);

    public List<Integer> getUniqueRandomList();
    public List<Integer> getUniqueRandomList(int size);
}
