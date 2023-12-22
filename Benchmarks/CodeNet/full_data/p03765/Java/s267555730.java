import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int N_S = S.length();
        int N_T = T.length();
        long[] ruiseki_S = new long[N_S+1];
        long[] ruiseki_T = new long[N_T+1];
        for (int i=0;i<N_S;i++) {
            int add=0;
            if (S.charAt(i)=='A') add=1;
            else add=2;
            ruiseki_S[i+1] = ruiseki_S[i]+add;
        }
        for (int i=0;i<N_T;i++) {
            int add=0;
            if (T.charAt(i)=='A') add=1;
            else add=2;
            ruiseki_T[i+1] = ruiseki_T[i]+add;
        }
        // System.out.println(Arrays.toString(ruiseki_S));
        // System.out.println(Arrays.toString(ruiseki_T));

        int Q = sc.nextInt();
        for (int i=0;i<Q;i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());
            // System.out.println(((ruiseki_S[b]-ruiseki_S[a-1])-(ruiseki_T[d]-ruiseki_T[c-1]))%3);
            if (((ruiseki_S[b]-ruiseki_S[a-1])-(ruiseki_T[d]-ruiseki_T[c-1]))%3==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
