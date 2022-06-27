package sort;

import common.Tools;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = Tools.randomArr(10,50);
        Tools.printArray(arr);
        sort(arr);
        Tools.printArray(arr);
        System.out.println(Tools.sorted(arr));
    }


    public static void sort(int[] arr) {

        for (int curr = 0; curr < arr.length; curr++) {
            // 关键逻辑   i>0 说明其左侧还有数据，  如果当前数比左侧的数小，则交换
            for (int i =curr; i >0 && arr[i]<arr[i-1]; i--) {
                Tools.swap(arr,i,i-1);
            }
        }
    }

}
