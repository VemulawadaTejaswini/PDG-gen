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
        for (int i=0; i<N-K; i++) {
            if (A[i]==A[i+K]) {
                A[i+K] = 0;
            }
        }

        System.out.println(Arrays.stream(A).sum());
    }
}