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

        char A[] = new char[N];
        for (int i=0; i<N; i++) {
            if ("r".equals(T.substring(i,i+1))) {
                A[i] = 'p';
            } else if ("s".equals(T.substring(i,i+1))) {
                A[i] = 'r';
            } else {
                A[i] = 's';
            }
        }
        for (int i=0; i<N-K; i++) {
            if (A[i]==A[i+K]) {
                A[i+K] = 'x';
            }
        }
        long sum = 0;
        for (int i=0; i<N; i++) {
            if (A[i]=='p') {
                sum += P;
            } else if (A[i]=='r') {
                sum += R;
            } else if (A[i]=='s') {
                sum += S;
            }
        }
        
        System.out.println(sum);
    }
}