import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int black = 0;
        int white = 0;
        for (int i = 0; i < n; i++) {
            if (i > 0 && s[i-1] == s[i])
                continue;
            if (s[i] == '#')
                black++;
            else
                white++;
        }

        System.out.println(Math.min(black, white));
    }
}
