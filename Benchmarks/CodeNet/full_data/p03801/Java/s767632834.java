import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        Yama[] Y = new Yama[N];
        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            Y[i] = new Yama(a, i);
        }
        Arrays.sort(Y);

        StringBuilder s = new StringBuilder();
        for (int j = 0; j < N;) {
            int aa = Y[j].a;
            int ii = Y[j].i;
            int cnt = 0;
            int k = j;
            while (k < N && aa == Y[k].a) {
                ii = Y[k].i;
                Y[k++].a--;
                cnt++;
            }
            while (cnt-- > 0) {
                s.append(ii + 1);
            }
            if (k < N && Y[j].a >= Y[k].a) {
                continue;
            }
            j = k + 1;
        }

        long[] freq = new long[N];
        for (int i = 0; i < N; i++) {
            String str = String.valueOf(i + 1);
            int idx = s.indexOf(str);
            while (idx > -1) {
                freq[i]++;
                idx = s.indexOf(str, idx + 1);
            }
        }

        for (long f : freq) {
            System.out.println(f);
        }
    }
}

class Yama implements Comparable<Yama> {
    int a, i;

    Yama(int a, int i) {
        this.a = a;
        this.i = i;
    }

    @Override
    public int compareTo(Yama o) {
        if (o.a != a) {
            return o.a - a;
        }
        return o.i - i;
    }

    @Override
    public String toString() {
        return String.format("(a=%d,i=%d)", a, i);
    }
}