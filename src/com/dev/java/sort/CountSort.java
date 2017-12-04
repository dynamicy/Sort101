package com.dev.java.sort;

public class CountSort {

    public int getMax(Integer[] arr) {
        int max = arr[0];
        for (int anArr : arr) {
            if (anArr > max)
                max = anArr;
        }
        return max;
    }

    public void countSort(Integer[] arr, int max) {
        // 存放臨時數據的數組tmp，初始元素都是0；k為數組中最大元素
        int[] tmp = new int[max + 1];

        // 計算數組中每個元素i出現的次數，存入數組tmp中的第i項，即原數組中的元素值為tmp數組中的下標
        for (int i = 0; i <= arr.length - 1; i++) {
            tmp[arr[i]]++;
        }

        // 計算數組中小於等於每個元素的個數,即從tmp中的第一個元素開始，每一項和前一項相加
        for (int j = 1; j <= max; j++) {
            tmp[j] = tmp[j] + tmp[j - 1];
        }

        // result數組用來來存放排序結果
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            result[tmp[arr[i]] - 1] = arr[i];
            tmp[arr[i]]--;
        }
        display(result);
    }

    private void display(int[] arr) {
        for (int anArr : arr) {
            System.out.print(anArr + "  ");
        }
        System.out.println();

    }
}
