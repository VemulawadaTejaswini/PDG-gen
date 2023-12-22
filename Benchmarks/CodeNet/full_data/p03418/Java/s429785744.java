import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long K = sc.nextInt();
        long res = 0;
        if (K == 0) {
            System.out.println(N*N);
        }
        for (int b = 1 ; b <= N ; b++) {
            long p = N / b ;
            long r = N % b;
            res += p * Math.max(0,  b - K) + Math.max(0,  r - K + 1);
        }
        System.out.println(res);
    }

}