import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int size = (n + 1) / 2;
        int[] array = new int[size];

        for (int i = 0; i < n; i++) {
            array[sc.nextInt() / 2]++;
        }

        if (n % 2 == 1 && array[0] != 1) {
            System.out.println(0);
            return;
        } else if (n % 2 == 0 && array[0] != 2) {
            System.out.println(0);
            return;
        }

        for (int i = 1; i < size; i++) {
            if (array[i] != 2) {
                System.out.println(0);
                return;
            }
        }

        int kaijo = n % 2 == 0 ? size : size - 1;

        System.out.println(pow(2, kaijo, 1000000007));
    }

    //return a^b mod M O(logB)
    private static long pow(long a, long b, int M) {
        long ret = 1;
        long tmp = a;
        while (b > 0) {
            if ((b & 1) == 1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b >> 1;
        }
        return ret;
    }
}