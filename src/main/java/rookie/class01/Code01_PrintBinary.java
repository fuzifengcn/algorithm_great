package rookie.class01;

public class Code01_PrintBinary
{
    // ��ӡ������
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

        // �����ڼ�����еı�ʾ
        // �������-2^32 ~ 2^32-1
//        print(Integer.MAX_VALUE);

        // ������  ����λΪ1  ���������λԴ��ȡ��+1
        // ��������ò����ʶ����
        // Դ�� �� ����  ~+1
        // ���� �� Դ��  ~+1
//        print(5);
//        print(-5);
//        print(~5);
//        print(~5+1);

        // Integer.MIN_VALUE �ǲ��� 0x80000000
        // 2^31 �ײ���ռ����32��bit 1��������30��0��������0
        print(Integer.MIN_VALUE);

    }
}
