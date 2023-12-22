import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a[] = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        long total = 0;
        long man = 0;
        boolean iniZero = true;
        int zeroCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (iniZero) {
                if (a[i] == 0) {
                    zeroCount++;
                } else {
                    iniZero = false;
                    if (Math.abs(a[i]) == 1 && i != 0) {
                        total += a[i] + a[i] > 0 ? 1 : -1;
                        man += 1;
                    } else {
                        total += a[i];
                    }
                }
            } else {
                if (total * (total + a[i]) >= 0) {
                    long x = Math.abs(total + a[i]) + 1;
                    if (total > 0) {
                        total += a[i] - x;
                    } else {
                        total += a[i] + x;
                    }
                    man += x;
                } else {
                    total += a[i];
                }
            }
        }
        if (zeroCount > 0) {
            man += (zeroCount - 1) * 2 + 1;
        }

        System.out.println(man);
    }
}
