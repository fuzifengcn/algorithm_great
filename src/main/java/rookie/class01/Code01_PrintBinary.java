package rookie.class01;

public class Code01_PrintBinary
{
    // 打印二进制
    public static void print(int num){
        for (int i = 31; i >= 0; i--)
        {
            System.out.print((num & (1 << i)) == 0?"0":1 );
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
//        int num = 2;
//        print(num);

        // 负数在计算机中的表示
        // 计算机中-2^32 ~ 2^32-1
//        print(Integer.MAX_VALUE);

        // 负数是  符号位为1  补码其余各位源码取反+1
        // 计算机中用补码标识负数
        // 源码 》 补码  ~+1
        // 补码 》 源码  ~+1
//        print(5);
//        print(-5);
//        print(~5);
//        print(~5+1);

        // Integer.MIN_VALUE 是补码 0x80000000
        // 2^31 底层是占用了32个bit 1···（30个0）···0
        print(Integer.MIN_VALUE);

    }
}
