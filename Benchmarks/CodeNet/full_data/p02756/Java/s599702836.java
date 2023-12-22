import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Q = sc.nextInt();
        int[] T = new int[Q];
        int[] F = new int[Q];
        String[] C = new String[Q];
        StringBuffer str = new StringBuffer(S);
        boolean reverse = false;
        for (int i = 0; i < Q; i++) {
            T[i] = sc.nextInt();
            reverse = T[i] == 1 ? !reverse : reverse;
            if (T[i] == 2) {
                F[i] = sc.nextInt();
                C[i] = sc.next();
                if (F[i] == 1) {
                    if (reverse) {
                        str.append(C[i]);
                    } else {
                        str.insert(0, C[i]);
                    }
                } else {
                    if (reverse) {
                        str.insert(0, C[i]);
                    } else {
                        str.append(C[i]);
                    }
                }
            }
        }
        System.out.println(reverse ? str.reverse().toString() : str.toString());
    }
}
