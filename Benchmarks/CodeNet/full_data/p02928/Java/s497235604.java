import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long mod = 1000000000 + 7;

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long inversion = 0L;
        long inA = 0;
        long cA = 0;
        for (int i = 0; i < N; i++) {
//            inA = 0;
            for (int j = 0; j < i; j++) {
                if (A[j] > A[i]) {
                    inA++;
//                    System.out.println("i : " + i + ", j : " + j);
//                    System.out.println("Ai : " + A[i] + ", Aj : " + A[j]);
                }
            }
//            System.out.println("COUNT = " + inA);
//            inversion += inA;

//            cA = 0;
            for (int j = 0; j < N; j++) {
                if (A[j] > A[i]) {
                    cA++;
//                    System.out.println("i2 : " + i + ", j2 : " + j);
//                    System.out.println("Ai2 : " + A[i] + ", Aj2 : " + A[j]);
                }
            }
//            inversion += cA;
        }

//        for (int i = 0; i < N; i++) {
//            count = 0;
//            for (int j = 0; j < N - 1; j++) {
//                if (A[i] > A[j]) {
//                    count++;
//                }
//            }
//            inversion += count % mod;
//        }
        inversion = (((inA * K )% mod) + ((cA * K * (K - 1) / 2)% mod)) % mod;

        System.out.println(inversion);
    }
}
