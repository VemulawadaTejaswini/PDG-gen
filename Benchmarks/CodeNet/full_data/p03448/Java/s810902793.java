import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        try(final Scanner scanner = new Scanner(System.in);) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();
            final int c = scanner.nextInt();
            final int x = scanner.nextInt();

            int cnt = 0;
            for (int aCnt = 0; aCnt <= a; aCnt++) {
                for (int bCnt = 0; bCnt <= b; bCnt++) {
                    if (((aCnt * 500) + (bCnt * 100)) > x) {
                        break;
                    }
                    for (int cCnt = 0; cCnt <= c; cCnt++) {
                        if (((aCnt * 500) + (bCnt * 100) + (cCnt * 50)) == x) {
                            cnt++;
                        }
                    }
                }
            }
            System.out.println(cnt);

        }
    }
}