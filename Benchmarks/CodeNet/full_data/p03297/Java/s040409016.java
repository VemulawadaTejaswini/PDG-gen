import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        long[] As = new long[T];
        long[] Bs = new long[T];
        long[] Cs = new long[T];
        long[] Ds = new long[T];

        FOR:
        for (int t = 0; t < T; t++) {
            As[t] = scanner.nextLong();
            Bs[t] = scanner.nextLong();
            Cs[t] = scanner.nextLong();
            Ds[t] = scanner.nextLong();
            List<Long> remains = new ArrayList<>();
            System.out.println("i: "  + t);
            while (As[t] >= Bs[t]) {
                long temp = (long) (Bs[t] * (As[t] / Bs[t] + Math.ceil(Cs[t] / Bs[t])));
                As[t] -= (temp < As[t] ? temp : Bs[t]);
                if (As[t] <= Cs[t]) {
                    As[t] += Ds[t];
                }

                if (remains.contains(As[t])) {
                    System.out.println("Yes");
                    continue FOR;
                } else {
                    remains.add(As[t]);
                }
            }
            System.out.println("No");
        }
    }
}