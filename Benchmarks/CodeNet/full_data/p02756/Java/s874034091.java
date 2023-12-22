import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Q = sc.nextInt();
        boolean nowReverse = false;
        for (int i = 0; i < Q; i++) {
            int T = sc.nextInt();
            if (T == 1) {
                nowReverse = nowReverse? false : true;
            } else {
                int F = sc.nextInt();
                String C = sc.next();
                if (F == 1) {
                    S = nowReverse? S + C : C + S;
                } else {
                    S = nowReverse? C + S : S + C;
                }
            }
        }
        System.out.println(nowReverse? reverseString(S) : S);
    }

    public static String reverseString(String S) {
        StringBuffer str = new StringBuffer(S);
        return str.reverse().toString();
    }
}
