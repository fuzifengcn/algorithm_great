package rookie.class01;
/*
    插入排序
 */
public class Code05_InsertSort {


    /*
        https://www.mashibing.com/study?courseNo=337&sectionNo=30728&courseVersionId=1254
        1、0~N上有序
        2、需要做N套事情
        3、每一套中停止条件左边数字比当前数字小，左边没数了
     */
    public static void insertSort(int[] arr) {
        // 处理边界条件 为空或者长度小于2都不需要排序直接返回
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        // 0~N-1 需要循环N次代表做N套事情
        for (int end = 1; end < N; end++) { //因为0~0上只有一个数默认有序，所以从1开始
            // 二层循环看停止条件，
            //cur - 1 >= 0 代表左边还有数，arr[cur] < arr[cur - 1] 代表左边数比右边大需要交换
            for (int cur = end; cur - 1 >= 0 && arr[cur] < arr[cur - 1] ; cur--) {
                swap(arr, cur, cur - 1);
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
        insertSort(arr);
        print(arr);

    }
}
