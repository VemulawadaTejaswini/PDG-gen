import java.util.*;
public class Main {
    public static void main(String[] args) {
        //data input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] s = sc.next().toCharArray();

        long ct = 1;

        char pref = s[0];

        for (int i = 1; i < s.length; i++) {
            if (pref != s[i]) {
                ct++;
                pref = s[i];
            }
        }

        System.out.println(ct);

    }
}