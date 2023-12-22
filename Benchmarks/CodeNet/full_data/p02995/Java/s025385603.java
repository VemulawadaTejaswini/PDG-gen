import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            long[] a = readLongArray(reader);
            long A = a[0];
            long B = a[1];
            long C = a[2];
            long D = a[3];

            long lcm = lcm(C, D);

            long x = (B - B / C) - (A - 1 - (A - 1) / C);
            long y = (B - B / D) - (A - 1 - (A - 1) / D);
            long z = (B - B / lcm) - (A - 1 - (A - 1) / lcm);

            System.out.println(x + y - z);
        }
    }

    public static long gcd(long M, long N) {
        long a;

        if (M < N) {
            a = N;
            N = M;
            M = a;
        }

        while (M % N != 0) {
            a = N;
            N = M % N;
            M = a;
        }

        return N;
    }

    public static long lcm(long M, long N) {
        return M * N / gcd(M, N);
    }

    public static long[] readLongArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        long[] array = new long[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Long.parseLong(str[i]);
        }
        return array;
    }

}
