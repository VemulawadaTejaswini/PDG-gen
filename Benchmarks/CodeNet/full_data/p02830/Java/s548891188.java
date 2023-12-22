import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        char[] sarr = S.toCharArray();
        char[] tarr = T.toCharArray();
        String ans = "";
        for (int i = 0; i < N; i++) {
            ans += sarr[i];
            ans += tarr[i];
        }

        System.out.println(ans);

    }
}