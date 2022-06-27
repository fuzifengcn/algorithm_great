package sort;

import common.Tools;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = Tools.randomArr(10,50);
        Tools.printArray(arr);
        sort(arr);
        Tools.printArray(arr);
        System.out.println(Tools.sorted(arr));
    }


    public static void sort(int[] arr) {
        for (int end = arr.length-1; end >= 0; end--) {
            for (int i = 0; i < end; i++) {

                if(arr[i] > arr[i+1]){
                    Tools.swap(arr,i,i+1);
                }
            }
        }
    }


}
