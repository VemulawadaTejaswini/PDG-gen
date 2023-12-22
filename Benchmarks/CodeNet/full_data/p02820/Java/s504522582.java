import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final int K = Integer.parseInt(sc.next());
        final int R = Integer.parseInt(sc.next());
        final int S = Integer.parseInt(sc.next());
        final int P = Integer.parseInt(sc.next());
        final String T = sc.next();
        sc.close();

        int A[] = new int[N];
        for (int i=0; i<N; i++) {
            if ("r".equals(T.substring(i,i+1))) {
                A[i] = P;
            } else if ("s".equals(T.substring(i,i+1))) {
                A[i] = R;
            } else {
                A[i] = S;
            }
        }
        int M[] = {P, R, S};
        Arrays.sort(M);
        for (int i=0; i<K; i++) {
            for (int j=i; j<N-K; j+=K) {
                if (A[j]==A[j+K] & A[j]==M[2]) {
                    A[j+K] = 0;
                }
            }
            for (int j=i; j<N-K; j+=K) {
                if (A[j]==A[j+K] & A[j]==M[1]) {
                    A[j+K] = 0;
                }
            }
            for (int j=i; j<N-K; j+=K) {
                if (A[j]==A[j+K] & A[j]==M[0]) {
                    A[j+K] = 0;
                }
            }
        }
        long sum = 0;
        for (int i=0; i<N; i++)
            sum += A[i];

        System.out.println(sum);
    }
}