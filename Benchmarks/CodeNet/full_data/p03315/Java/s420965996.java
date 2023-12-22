import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            ans += S.charAt(i) == '+' ? 1 : -1;
        }
        System.out.println(ans);
    }
}
