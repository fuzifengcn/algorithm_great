package rookie.class01;

/**
 * 阶乘
 */
public class Code02_SumOfFactorial
{
    public static long f1(int N) {
        long ans = 0;
        for (int i = 1; i <= N; i++)
        {
            ans += _factorial(i);
        }
        return ans;
    }

    public static long factorial(int N) {
        long ans = 1;
        for (int i = 1; i <= N; i++)
        {
            ans *= i;
        }
        return ans;
    }
    // �ݹ�
    public static long _factorial(int N) {
        if(N == 1){
            return 1;
        }
        return N * _factorial(N-1);
    }

    public static long f2(int N) {
        long ans = 0;
        long cur = 1;
        for (int i = 1; i <= N; i++)
        {
            cur *= i;
            ans += cur;
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 10;
        System.out.println(f1(N));
        System.out.println(f2(N));
    }
}
