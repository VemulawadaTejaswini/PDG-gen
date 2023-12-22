import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = solve(S);

        System.out.println(ans);
    }

    private static int solve(String S) {
        int N = 0;

        for (int i=0; i<S.length(); i++) {
            N += S.charAt(i) == '+' ? 1 : -1;
        }

        return N;
    }
}
