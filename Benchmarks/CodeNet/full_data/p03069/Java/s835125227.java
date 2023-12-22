import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int black = 0;
        int white = 0;
        boolean isWhite = false;
        for (int i = n-2; i >= 0; i--) {
            if (s[i] == '.')
                isWhite = true;
            else {
                int cnt = 0;
                for (int j = i+1; j < n; j++) {
                    if (s[j] =='.')
                        cnt++;
                    else
                        break;
                }

                white += cnt;
                if (isWhite)
                    black++;
            }
        }

        System.out.println(Math.min(black, white));
    }
}

