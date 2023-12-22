import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String S = sc.next();

        int ans = 700;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'o') ans += 100;
        }
        System.out.println(ans);
    }
}
