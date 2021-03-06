package random;
public class RandomTest {

    public static void main(String[] args) {

        test7();

    }

    public static void test1() {
        int loopTimes = 20000000;
        int[] counts = new int[10];
        int count = 0;
        for (int i = 0; i < loopTimes; i++) {

            double random = Math.random();
            if (random <= 0.1d) {
                count++;
            }
        }
        System.out.println("???? " + count + " ??");
        System.out.println((double) count / (double) loopTimes);
    }

    public static void test2() {
        int loopTimes = 20000000;
        int[] counts = new int[10];
        for (int i = 0; i < loopTimes; i++) {

            int random = (int) (Math.random() * 4) + 4;
            counts[random]++;
        }

        printArray(counts);

    }

    public static void test3() {
        int loopTimes = 20000000;
        int[] counts = new int[10];
        for (int i = 0; i < loopTimes; i++) {

            int random = (int) (Math.random() * 4) + 4;
            counts[random]++;
        }

        printArray(counts);

    }

    public static void test4() {
        int loopTimes = 5000000;
        int[] counts = new int[10];
        for (int i = 0; i < loopTimes; i++) {

            int random = random01_();
            counts[random]++;
        }

        printArray(counts);

    }

    public static int random01() {
        return (int) (Math.random() * 10) < 5 ? 0 : 1;
    }
    public static int random01_() {
        int i = (int) (Math.random() * 3);
        while (i ==1){
            i = (int) (Math.random() * 3);
        }
        return i == 0 ? 0 : 1;
    }

    public static void test5() {
        int loopTimes = 5000000;
        int[] counts = new int[10];
        for (int i = 0; i < loopTimes; i++) {

            int random = random01_();
            counts[random]++;
        }

        printArray(counts);

    }

    public static void test6(){
        System.out.println(~6 + 1);
    }

    public static void test7() {
        int loopTimes = 5000000;
        int count = 0;
        for (int i = 0; i < loopTimes; i++) {
            // ????<0.4?ĸ?????0.16 ??0.4^2
            double random = randomPow2();
            if(random < 0.4){
                count++;
            }
        }
        System.out.println(Math.pow(0.4,2.0));
        System.out.println(count/(double)loopTimes);
    }


    public static double randomPow2(){
        // random ?????ζ????¼??? max?????ζ????¼?????????
        // ????X ???????????????µ?ֵ<=x
        return Math.max(Math.random(),Math.random());
    }

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " ???? " + arr[i] + " ??");
        }

    }

}
