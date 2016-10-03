package com.dev.java.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.abs;

/**
 * Lists of Random Number generated, you can specify the size, min, max, and whether it's unique or not.
 */
public class RandNumUtil implements RandNum {
    @Override
    public List<Integer> getRandomList() {
        return getRandomList(10);
    }

    @Override
    public List<Integer> getRandomList(int size) {
        List<Integer> dataList = new ArrayList<>();
        Random random = new Random(size);
        for (int i = 0; i < size; i++) {
            dataList.add(random.nextInt(size) + 1);
        }
        return dataList;
    }

    @Override
    public List<Integer> getUniqueRandomList() {
        return getUniqueRandomList(10);
    }

    @Override
    public List<Integer> getUniqueRandomList(int size) {
        List<Integer> dataList = new ArrayList<>();
        while (dataList.size() < size) {
            int randNum = (int) (Math.random() * size);
            if (!dataList.contains(randNum)) {
                dataList.add(randNum);
            }
        }
        return dataList;
    }

    @Override
    public List<Integer> getRandomList(int min, int max, int size) {
        List<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            dataList.add(ThreadLocalRandom.current().nextInt(min, max + 1));
        }
        return dataList;
    }

    @Override
    public List<Integer> getRandomList(int min, int max) {
        return getRandomList(min, max, 10);
    }

    @Override
    public List<Integer> getUniqueRandomList(int min, int max, int size) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        List<Integer> dataList = new ArrayList<>();
        if (size <= abs(max - min)) {
            while (dataList.size() < size) {
                int randNum = (int) (Math.random() * size);
                if (!dataList.contains(randNum)) {
                    dataList.add(ThreadLocalRandom.current().nextInt(min, max + 1));
                }
            }
        } else {
            dataList = getRandomList(min, max);
        }
        return dataList;
    }

    @Override
    public List<Integer> getUniqueRandomList(int min, int max) {
        return getUniqueRandomList(min, max, abs(max - min));
    }
}
