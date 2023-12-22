import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String S = stdIn.next();
        int Q = stdIn.nextInt();
        int[] T = new int[Q];
        int[] F = new int[Q];
        String[] C = new String[Q];

        for (int i = 0; i < Q; i++) {
            T[i] = stdIn.nextInt();
            if (T[i] == 2) {
                F[i] = stdIn.nextInt();
                C[i] = stdIn.next();
            } else {
                F[i] = 0;
                C[i] = "";
            }
        }
        stdIn.close();

        for (int i = 0; i < Q; i++) {
            if (T[i] == 1) {
                StringBuffer str = new StringBuffer(S);
                S = str.reverse().toString();
            } 
            if (T[i] == 2) {
                if (F[i] == 1) {
                    S = C[i] + S;
                }
                if (F[i] == 2) {
                    S = S + C[i];
                }
            }
        }
        System.out.println(S);
    }
}