import java.util.Scanner;

public class Main {
    static int N;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        scanner.close();
    }

    private static boolean digitJudge(int i) {
        boolean is7 = false;
        boolean is5 = false;
        boolean is3 = false;
        while (0 < i) {
            int digit = i % 10;
            switch (digit) {
                case 7:
                    is7 = true;
                    break;
                case 5:
                    is5 = true;
                    break;
                case 3:
                    is3 = true;
                    break;
                default:
                    return false;
            }
            i /= 10;
        }
        if(is3 && is5 && is7) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        init();

        int ans = 0;
        for(int i = 0; i <= N; i++) {
            if(digitJudge(i)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}