package rookie.class01;

/**
 * 冒泡排序
 */
public class Code04_BubbleSort {


    /*
        1、从0~N-1上做两两比较
     */
    public static void bubbleSort(int[] arr) {
        // 处理边界条件 为空或者长度小于2都不需要排序直接返回
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        // 只是控制排序需要多少套比较
        // 方向是因为要控制每一次比较的终点下标，便于计算
        for (int end = N - 1; end >= 0; end--) {
            // 两两比较，每一次比较到end位置
            // j < end 下标每一次都到截止位置的前一个，所有需要每次以j和j+1比，这样可以覆盖到0~end的所有数据
            for (int j = 0; j < end; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }


    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 2, 8, 5, 4, 9, 6, 4, 2, 1, 2, 5};

        print(arr);
        bubbleSort(arr);
        print(arr);

    }

}
