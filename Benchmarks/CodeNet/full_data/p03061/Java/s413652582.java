import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        int gcd = gcd(A);
        int max = 1;
        if (N == 2) {
            max = Math.max(A[0], A[1]);
        } else {
            for (int i=0; i<N; i++) {
                List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
                list.remove(i);
                int[] array = list.stream().mapToInt(l->l).toArray();
                int tmp = gcd(array);
                if (tmp > max)
                    max = tmp;
            }
        }
        if (gcd > max)
            System.out.println(gcd);
        else
            System.out.println(max);
    }

    public static final int gcd(final int[] param) {
        final int len = param.length;
        int g = gcd(param[0], param[1]);    //gcd(a, b) は以前作ったもの
        for (int i = 1; i < len - 1; i++) {
            g = gcd(g, param[i + 1]);       //gcd(a, b) は以前作ったもの
        }
        return g;
    }

    private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}