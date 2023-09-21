package rookie.class01;

/**
 * 选择排序
 */
public class Code03_SelectSort
{
    /*
        选择排序：
        1、每一次选择出剩余未排序中最小的一个数放在未排序范围的第一个位置上 需要做N次才能将N个位置上的数据都排序一遍
        2、直到将所有位置完成一次排序
     */
    public static void selectSort(int[] arr){
        // 处理边界条件 为空或者长度小于2都不需要排序直接返回
        if(arr == null || arr.length < 2)
        {
            return;
        }
        // 需要将所有位置都处理一次，一共有N个位置
        int N = arr.length;
        // 需要处理N个位置需要处理N次
        for (int i = 0; i < N; i++) {
            // 当前需要找出最小的值放在i位置上
            int minValueIndex = i;
            for (int j = i + 1; j < N; j++) {
                // 假设当前最小值就是i位置上的数，再从i+1开始找比当前位置小的数
                // 如果小就交换坐标，如果不小就不的那个
                minValueIndex = arr[minValueIndex] > arr[j] ? j : minValueIndex;
            }
            // 交换
            swap(arr, i, minValueIndex);
        }
    }
    public static void swap(int[] arr, int i, int j){
        if(i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {2,5,7,2,8,5,4,9,6,4,2,1,2,5};

        print(arr);
        selectSort(arr);
        print(arr);

    }
    
    
}
