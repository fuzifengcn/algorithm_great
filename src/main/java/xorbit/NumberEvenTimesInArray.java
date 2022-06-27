package xorbit;

public class NumberEvenTimesInArray {

    // 找出数组中唯一一个出现奇数次的数

    public static void main(String[] args) {
        int[] arr = {5,3,2,2,3,3,7,9,7,3,9,5,5};
        filter(arr);
    }

    public static void filter(int[] arr){
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        System.out.println(eor);
    }


}
