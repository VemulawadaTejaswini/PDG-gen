import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Q = sc.nextInt();
        int[] T = new int[Q];
        int[] F = new int[Q];
        char[] C = new char[Q];
        StringBuilder str = new StringBuilder(S);
        boolean reverse = false;
        for (int i = 0; i < Q; i++) {
            T[i] = sc.nextInt();
            reverse = T[i] == 1 ? !reverse : reverse;
            if (T[i] == 1) {
                continue;
            }
            F[i] = sc.nextInt();
            C[i] = sc.next().charAt(0);
            if (F[i] == 1) {
                if (reverse) {
                    str.append(C[i]);
                    continue;
                }
                str.insert(0, C[i]);
                continue;
            }
            if (reverse) {
                str.insert(0, C[i]);
                continue;
            }
            str.append(C[i]);
        }
        System.out.println(reverse ? str.reverse().toString() : str.toString());
    }
}