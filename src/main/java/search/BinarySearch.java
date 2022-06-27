package search;


import common.Tools;
import sort.InsertionSort;

import java.util.Arrays;

public class BinarySearch {


    public static void main(String[] args) {

        int loopTimes = 10000;
        for (int i = 0; i < loopTimes; i++) {
            int[] arr = Tools.randomArr(10, 10);
            InsertionSort.sort(arr);
            int targetIndex = Tools.randomInt(arr.length) - 1;
            int i1 = Arrays.binarySearch(arr, arr[targetIndex]);
            int search = search(arr, arr[targetIndex]);
            if (i1 != search) {
                Tools.printArray(arr);
                System.err.println("target: " + arr[targetIndex]);
                System.err.println("Arrays.binarySearch: " + i1);
                System.err.println("search: " + search);
                return;
            }
            System.out.println("==================");
            Tools.printArray(arr);
            System.out.println("target: " + arr[targetIndex]);
            System.out.println("Arrays.binarySearch index: " + i1);
            System.out.println("search index: " + search);
            System.out.println();
        }
        System.out.println("check success");
    }

    public static int search(int[] arr, int target) {

        if (!Tools.sorted(arr)) {
            throw new RuntimeException("unsorted");
        }

        if (arr.length < 1) {
            return -1;
        }

        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        int middleIndex = (leftIndex + (rightIndex - leftIndex) >> 1); // 规避int类型溢出

        // 停止条件：left 、right  交换相对位置
        while (leftIndex <= rightIndex) {
            if (arr[middleIndex] > target) {
                rightIndex = middleIndex - 1;
            } else if (arr[middleIndex] < target) {
                leftIndex = middleIndex + 1;
            } else if (arr[middleIndex] == target) {
                return middleIndex;
            }
            middleIndex = (leftIndex + (rightIndex - leftIndex) >> 1);
        }
        return -1;
    }

}
