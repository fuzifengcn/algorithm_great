package search;

public class LocalMinSearch {


    public static void main(String[] args) {


        int[] arr = {9,8,7,6,5,4,2,6,7,8,9};

        int searchIndex = search(arr);
        System.out.println("index : " + searchIndex +"  value: " + arr[searchIndex]);
    }


    public static int search(int arr[]) {

        if (arr.length < 2) {
            return -1;
        }

        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        int middleIndex;
        if (arr[leftIndex] < arr[leftIndex + 1]) {
            return 0;
        }
        if (arr[rightIndex] < arr[rightIndex - 1]) {
            return arr.length - 1;
        }
        while (leftIndex<=rightIndex) {

            middleIndex = leftIndex + ((rightIndex - leftIndex) >> 1);
            if(arr[middleIndex] > arr[middleIndex +1]){
                leftIndex = middleIndex + 1;
            }else if(arr[middleIndex] >arr[middleIndex-1]){
                rightIndex = middleIndex -1;
            }else if(arr[middleIndex] < arr[middleIndex-1]
                    && arr[middleIndex]<arr[middleIndex+1]){
                return middleIndex;
            }
        }
        return -1;
    }


}
