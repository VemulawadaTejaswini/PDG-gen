import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int black = 0;
        int white = 0;
        for (int i = n-2; i >= 0; i--) {
            if (s[i] == '#') {
                int cnt = 0;
                for (int j = i+1; j < n; j++) {
                    if (s[j] =='.')
                        cnt++;
                    else
                        break;
                }

                black++;
                white += cnt;
            }
        }

        System.out.println(Math.min(black, white));
    }
}
