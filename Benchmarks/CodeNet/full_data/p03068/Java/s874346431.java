import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();

        char tar = S.charAt(K - 1);
        char[] res = new char[S.length()];

        for (int i = 0; i < S.length(); i++) {
            if (tar != S.charAt(i)) {
                res[i] = '*';
            } else {
                res[i] = S.charAt(i);
            }
        }
        System.out.println(res);
    }
}