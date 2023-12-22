import java.util.Scanner;

public class Main {
    static public void main(String[] args){
        Scanner in = new Scanner(System.in);

        long N = in.nextInt();
        long M = in.nextInt();
        String S = in.next();
        String T = in.next();

        long L = lcm(N, M);
        long ln = L/N;
        long lm = L/M;

        int n=0;
        int m=0;
        while (n<N && m<M){
            if (n * ln == m * lm) {
                if (S.charAt(n) != T.charAt(m)){
                    System.out.println("-1");
                    System.exit(0);
                }
            }
            if (n*ln == m*lm){ n++; m++;
            }else if (n*ln < m*lm) n++;
            else m++;
        }

        System.out.println(L);
    }

    private static long gcd(long m, long n){
        if (m < n) return gcd(n, m);
        if (n == 0) return m;
        return gcd(n, m%n);
    }

    private static long lcm(long m, long n){
        return m * n / gcd(m, n);
    }
}