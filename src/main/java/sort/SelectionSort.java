package sort;

import common.Tools;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = Tools.randomArr(10, 50);
        Tools.printArray(arr);
        sort(arr);
        Tools.printArray(arr);
        System.out.println(Tools.sorted(arr));
    }


    public static void sort(int[] arr) {
        for (int start = 0; start < arr.length; start++) {
            int minIndex = start;
            for (int j = start; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            Tools.swap(arr, start, minIndex);
        }
    }

}
