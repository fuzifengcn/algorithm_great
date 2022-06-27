package common;

public class Tools {


    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("]");
    }

    public static void swap(int[] arr, int fist, int second) {
        int temp = arr[fist];
        arr[fist] = arr[second];
        arr[second] = temp;

    }

    public static int[] randomArr(int maxLength, int maxValue) {
        int length = randomInt(maxLength);
        int max = randomInt(maxValue);
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = (int) (Math.random() * max);
        }
        return result;
    }

    public static int randomInt(int maxValue) {
        return (int) (Math.random() * maxValue) + 1;
    }

    public static boolean sorted(int[] arr) {
        if (arr.length < 2) {
            return true;
        }
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (temp > arr[i]) {
                return false;
            }
        }
        return true;

    }


    public static void printBinary(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(((1 << i) & num) == 0 ? "0" : "1");
            if(i%8==0){
                System.out.print(" ");
            }
        }
        System.out.print( " \t : "+ num);
        System.out.println();
    }

}
