import java.util.*;

class Main {
    final private static long mod = 998244353;
    public static void main(String[] args) {
        //final int MOD = 998244353;
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int D[] = new int[N];
        for (int i=0; i<N; i++)
            D[i] = Integer.parseInt(sc.next());
        sc.close();

        long C[] = new long[Arrays.stream(D).max().getAsInt() + 1];
        for (int i : D) {
            C[i]++;
        }

        if (D[0] != 0 || C[0] != 1) {
            System.out.println("0");
            return;
        }

        long ans = 1;
        for (int i=0; i<C.length-1; i++) {
            ans *= modPow(C[i], C[i+1]);
            ans %= mod;
        }

        System.out.println(ans);
    }

    private static long modPow(long x, long y) {
        long z = 1;
        while (y>0) {
            if (y%2==0) {
                x = (x * x) % mod;
                y /= 2;
            } else {
                z = (z * x) % mod;
                y--;
            }
        }
        return z;
    }
}