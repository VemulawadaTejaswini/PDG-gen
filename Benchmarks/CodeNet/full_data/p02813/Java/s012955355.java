import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < P.length; i++) {
            P[i] = sc.nextInt();
        }
        int[] Q = new int[N];
        for (int i = 0; i < Q.length; i++) {
            Q[i] = sc.nextInt();
        }
        System.out.println(Math.abs(num(P) - num(Q)));
        sc.close();
    }

    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static int num(int[] a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            int[] copy = new int[a.length - i];
            for (int j = 0; j < copy.length; j++) {
                copy[j] = a[i + j];
            }
            Arrays.sort(copy);
            int index = -1;
            for (int j = 0; j < copy.length; j++) {
                if (copy[j] == a[i]) {
                    index = j;
                }
            }
            res += fact(copy.length - 1) * index;
        }
        return res;
    }
}