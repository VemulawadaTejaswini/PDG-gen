import java.util.*;

public class Main {
    public void main(Scanner sc) {
        char alphabet[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char s[] = sc.next().toCharArray();
        int k = sc.nextInt();
        int n = s.length;

        for (int i = 0; i < n; i++) {
            int cnt = 26 - s[i] + 'a';
            if (k > cnt) {
                s[i] = 'a';
                k -= cnt;
            }
        }
        s[n - 1] = alphabet[(s[n - 1] - 'a' + k) % 26];

        System.out.println(new String(s));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
