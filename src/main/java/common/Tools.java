package common;
public class Tools {
    public static void printArr(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] copyArr(int[] arr){
        int[] copy = new int[arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);
        return copy;
    }

    public static boolean  isSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean equalValues(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static int[] generateArray(int arrLen,int maxValue){
        int[] ans = new int[(int) (Math.random() * arrLen)+1];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = (int) (Math.random() * maxValue);
        }
        return ans;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            printArr(generateArray(5,10));
        }
    }
}
