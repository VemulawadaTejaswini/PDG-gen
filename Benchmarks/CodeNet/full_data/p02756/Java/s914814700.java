import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Q = sc.nextInt();
        StringBuilder str = new StringBuilder(S);
        boolean reverse = false;
        for (int i = 0; i < Q; i++) {
            int T = sc.nextInt();
            reverse = T == 1 ? !reverse : reverse;
            if (T == 1) {
                continue;
            }
            int F = sc.nextInt();
            char C = sc.next().charAt(0);
            if (F == 1) {
                if (reverse) {
                    str.append(C);
                    continue;
                }
                str.insert(0, C);
                continue;
            }
            if (reverse) {
                str.insert(0, C);
                continue;
            }
            str.append(C);
        }
        System.out.println(reverse ? str.reverse().toString() : str.toString());
    }
}