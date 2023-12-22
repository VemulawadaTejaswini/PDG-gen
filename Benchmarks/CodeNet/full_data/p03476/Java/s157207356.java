import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            boolean[] f = new boolean[100001];
            int[] c = new int[100002];
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            for (int i = 2; i <= 100000; i++) {
                if (!f[i]) {
                    for (int j = i + i; j <= 100000; j += i) {
                        f[j] = true;
                    }
                }
            }
            for (int i = 3; i <= 100000; i += 2) {
                if (!f[i] && !f[(i + 1) / 2]) {
                    c[i]++;
                }
            }

            for (int i = 3; i <= 100000; i++) {
                c[i] += c[i - 1];
            }
            System.out.println( c[r] - c[l-1]);
        }

    }

    public static boolean isPrime(long a) {
        if(a < 2) return false;
        long i;
        for(i = 2; i * i <= a; i++) {
            if(a % i == 0) return false;
        }
        return true;
    }
}
