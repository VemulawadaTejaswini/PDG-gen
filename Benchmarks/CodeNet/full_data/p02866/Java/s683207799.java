
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long[] Di;
        long E = 998244353;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Di = new long[N];
            for (int i = 0; i < Di.length; i++) {
                Di[i] = sc.nextLong();
            }
        }
        if (N == 1) {
            System.out.println(1);
            return;
        }
        long[] Num = new long[N];
        long maxDis = 0;
        for (long l : Di) {
            Num[(int) l]++;
            if (l >= maxDis) {
                maxDis = l;
            }
        }
        //System.out.println(Arrays.toString(Num));
        //System.out.println(maxDis);
        for (int i = 0; i <= maxDis; i++) {
            if (Num[i] == 0) {
                System.out.println(0);
                return;
            }
        }
        if (Num[0] != 1) {
            System.out.println(0);
            return;
        }
        long result = 1;
        for (int i = 1; i <= maxDis; i++) {
            long up = Num[i - 1];
            long down = Num[i];
            long temp = 1;
            up = up % E;
            while (down > 0) {
                temp = temp * up;
                temp = temp % E;
                down--;
            }
            result = result * temp;
            result = result % E;
        }
        System.out.println(result);
    }
}
