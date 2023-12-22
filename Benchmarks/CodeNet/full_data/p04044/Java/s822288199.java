import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC042B - 文字列大好きいろはちゃんイージー / Iroha Loves Strings (ABC Edition)

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 1 <= n, l <= 100
        int l = sc.nextInt();
        String[] ss = new String[n];

        for (int i = 0; i < n; i++) {
            ss[i] = sc.next();
        }

        Arrays.sort(ss);

        StringBuilder sb = new StringBuilder("");
        for (String s : ss) {
            sb.append(s);
        }

        System.out.println(sb);
    }

}