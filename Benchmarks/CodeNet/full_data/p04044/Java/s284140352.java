import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        Arrays.sort(s);
        StringJoiner sj = new StringJoiner("");
        for (int j = 0; j < n; j++) {
            sj.add(s[j]);

        }
        System.out.println(sj.toString());
    }

}
