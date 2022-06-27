package xorbit;

import common.Tools;

public class XORTest {


    // 异或运算是无进位相加
    public static void main(String[] args) {

        test04();

        // 推广：连续异或运算中出现  基数
    }


    public static void test01() {
        int a = 12;
        int b = 88;
        System.out.print("a:\t\t\t");
        Tools.printBinary(a);
        System.out.print("b:\t\t\t");
        Tools.printBinary(b);
        System.out.println("====================================================");
        // A^A == 0
        System.out.print("a^a:\t\t");
        Tools.printBinary(a ^ a);
        // A^0 == A
        System.out.print("a^0:\t\t");
        Tools.printBinary(a ^ 0);

        //a ^ b ^ a  <==>  (a^a) ^ b <==> 0 ^ b = b
        System.out.print("a^b^a:\t\t");
        Tools.printBinary(a ^ b ^ a);
    }

    public static void test02() {
        int a = 12;
        int b = 88;
        System.out.print("a:\t\t\t");
        Tools.printBinary(a);
        System.out.print("b:\t\t\t");
        Tools.printBinary(b);
        System.out.print("a:\t\t\t");
        Tools.printBinary(a);
        System.out.println("====================================================");
        System.out.print("a^b^a:\t\t");
        Tools.printBinary(a ^ b ^ a);
    }


    // xor swap var
    public static void test03() {
        int a = 12;
        int b = 88;
        System.out.print("a:\t\t\t");
        Tools.printBinary(a);
        System.out.print("b:\t\t\t");
        Tools.printBinary(b);
        System.out.println("====================================================");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.print("a:\t\t\t");
        Tools.printBinary(a);
        System.out.print("b:\t\t\t");
        Tools.printBinary(b);
    }


    // 获取一个数最右一位为1的数
    public static void test04() {

        int a = 2315615;
        Tools.printBinary(a);
        Tools.printBinary(a & (~a + 1));
        Tools.printBinary(a & (-a));

    }

}
