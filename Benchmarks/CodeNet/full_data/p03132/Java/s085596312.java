import java.util.Scanner;

class D {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int L = sc.nextInt();
        final int[] A = new int[L];
        for (int i = 0; i < L; i++)
            A[i] = sc.nextInt();
        final long[] noneInc = new long[L + 1];
        final long[] oddInc = new long[L + 1];
        final long[] evenInc = new long[L + 1];
        for (int i = 0; i < L; i++) {
            noneInc[i + 1] = noneInc[i] + A[i];
            oddInc[i + 1] = Math.min(noneInc[i], oddInc[i]) + (A[i] + 1) % 2;
            evenInc[i + 1] = Math.min(noneInc[i], evenInc[i]) + (A[i] == 0 ? 2 : A[i] % 2);
        }
        final long[] noneDec = new long[L + 1];
        final long[] oddDec = new long[L + 1];
        final long[] evenDec = new long[L + 1];
        for (int i = L; i > 0; i--) {
            noneDec[i - 1] = noneDec[i] + A[i - 1];
            oddDec[i - 1] = Math.min(noneDec[i], oddDec[i]) + (A[i - 1] + 1) % 2;
            evenDec[i - 1] = Math.min(noneDec[i], evenDec[i]) + (A[i - 1] == 0 ? 2 : A[i - 1] % 2);
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0; i <= L; i++) {
            final long incMin = Math.min(noneInc[i], Math.min(oddInc[i], evenInc[i]));
            final long decMin = Math.min(noneDec[i], Math.min(oddDec[i], evenDec[i]));
            ans = Math.min(ans, incMin + decMin);
        }
        System.out.println(ans);
    }
}
public class Main {
    public static void main(String...args) {
        D.main();
    }
}
