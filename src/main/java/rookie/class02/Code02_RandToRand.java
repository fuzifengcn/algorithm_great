package rookie.class02;

public class Code02_RandToRand {

    /*
      Math.random(); 等概率产生一个[0,1)上的数
    */
    public static void main(String[] args) {

        int testTimes = 100000000;
        int count = 0;

        // 测试概率
//        for (int i = 0; i < testTimes; i++) {
//            if(Math.random() < 0.3){
//                count++;
//            }
//        }
//        System.out.println(count* 1.0/ testTimes );

//        count = 0;
//        // 再[0,K)上生成等概率的数
//        for (int i = 0; i < testTimes; i++) {
//            // [0,8) =>  Math.random() * 8
//            if(Math.random() * 8 >= 4.0 ){  // 一共八段数据，>=4 为4段数据，则概率应该是50%
//                count++;
//            }
//        }
//        System.out.println(count* 1.0/ testTimes );

        int[] counts = new int[8];
//        // (int)Math.random() * K  生成[0，K-1]的数字
//        for (int i = 0; i < testTimes; i++) {
//            counts[(int) (Math.random() * 8)]++;
//        }
//        for (int i = 0; i < counts.length; i++) {
//            System.out.println(counts[i]);
//        }


        // 此函数是获取一个[0,1)上的等概率的,获取[0,0.3)上的数是0.3的概率
//        double random = Math.random();
//
//        // 写一个方法是的获取0-x上的数的概率是x^2
//        count = 0;
//        for (int i = 0; i < testTimes; i++) {
//            if (xToXPower2() < 0.3){
//                count++;
//            }
//        }
//        System.out.println(count*1.0/testTimes);
//        System.out.println(Math.pow(0.3,2));

        System.out.println("================");
        counts = new int[8];
        // (int)Math.random() * K  生成[0，K-1]的数字
        for (int i = 0; i < testTimes; i++) {
            counts[f3()-1]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }
    }

    // [0,X)上的概率x^2
    public static double xToXPower2(){
        return Math.max(Math.random(),Math.random());
    }

    // 生成一个等概率获取1-5的整数
    public static int get1_5Number(){
        return 1+ (int)(Math.random() * 5);
    }
    //根据get1_5Number写一个0、1发生器
    public static int f2(){
        int ans = 0;
        do{
            ans = get1_5Number();
        }while (ans == 3);
        return ans > 3 ? 1:0;
    }
    // 使用0、1发生器生成二进制数
    public static int f3(){
        int ans = 0;
        do{
            ans = (f2() << 2) + (f2() <<1) +f2();
        }while (ans == 0);
        return ans;
    }


}
