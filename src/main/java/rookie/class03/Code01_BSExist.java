package rookie.class03;

import common.Tools;
import rookie.class01.Code05_InsertSort;

/*
  二分法判断有序数组数字是否存在
 */
public class Code01_BSExist {

    public static boolean exist(int[] arr, int target){

        if(arr == null || arr.length < 1)
        {
            return false;
        }
        int N = arr.length;
        int L = 0;
        int R = N-1;
        int mid ;
        while (L <= R ){ // 终止条件，左右边界交叉
            mid = L + ((R-L) >> 1); // 计算中点
            if(arr[mid] == target){
                return true;
            } else if (arr[mid] < target) {
                L = mid+1; // 中点值小于目标值，左边界移动到中点的下一个位置
            } else {
                R = mid-1;
            }
        }
        return false;
    }

    public static boolean test(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int testTimes = 10;
//        for (int i = 0; i < testTimes; i++) {
//            int[] arr = Tools.generateArray(5, 10);
//            Code05_InsertSort.insertSort(arr);
//            int target= (int) (Math.random() * 10);
//            if(test(arr, target) != exist(arr, target)){
//                System.out.println("校验失败");
//            }
//        }
//        int[] arr = {0,1,1,5,8};
//        exist(arr, 6);
        System.out.println(1>>2);
    }
}
