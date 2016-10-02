package com.dev.java.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by chris on 03/10/2016.
 */
public class RandNumUtil implements RandNum {
    @Override
    public List<Integer> getRandomList() {
        List<Integer> dataList = new ArrayList<Integer>();
        for(int i = 0; i < 10 ; i++) {
            int randNum = (int)(Math.random()*10);
            dataList.add(randNum);
        }
        return dataList;
    }

    @Override
    public List<Integer> getRandomList(int size) {
        List<Integer> dataList = new ArrayList<Integer>();
        Random random = new Random(size);
        for(int i = 0; i < size ; i++) {
            int randNum = random.nextInt(size) + 1;
            dataList.add(randNum);
        }
        return dataList;
    }
}
