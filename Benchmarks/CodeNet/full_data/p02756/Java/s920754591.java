import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Q = sc.nextInt();
        int[] T = new int[Q];
        int[] F = new int[Q];
        String[] C = new String[Q];
        for(int i = 0; i < Q; i++) {
            T[i] = sc.nextInt();
            if (T[i] == 1) {
                F[i] = 0;
                C[i] = "";
            } else {
                F[i] = sc.nextInt();
                C[i] = sc.next();
            }
        }
        sc.close();

        boolean reverse = false;
        for (int i = 0; i < Q; i++) {
            if (reverse == false) {
                if (T[i] == 1) {
                    T[i] = 0;
                    reverse = true;
                }
            } else {
                if (T[i] == 1) {
                    T[i] = 0;
                    reverse = false;
                } else {
                    if (F[i] == 1) {
                        F[i] = 2;
                    } else {
                        F[i] = 1;
                    }
                }
            }
        }
        StringBuilder sbuild = new StringBuilder(S);
        String ans = StringFormation(sbuild, Q, T, F, C, 0);
        if (reverse == true) {
            StringBuffer sb = new StringBuffer(ans);
            ans = sb.reverse().toString();
        }
        System.out.println(ans);
    }
    public static String StringFormation(StringBuilder S, int Q, int[] T, int [] F, String[] C, int index) {
        if (Q <= index) {
            return S.toString();
        }
        if (T[index] == 0) {
            return StringFormation(S, Q, T, F, C, index + 1);
        }
        else if (T[index] == 1) {
            if (index + 1 < Q && T[index+1] == 1) {
                return StringFormation(S, Q, T, F, C, index + 2);
            }
            S = S.reverse();
            return StringFormation(S, Q, T, F, C, index + 1);
        } else {
            if (F[index] == 1) {
                StringBuilder sb = new StringBuilder(C[index]);
                return StringFormation(sb.append(S), Q, T, F, C, index + 1);
            }
            return StringFormation(S.append(C[index]), Q, T, F, C, index + 1);
        }
    }
}
