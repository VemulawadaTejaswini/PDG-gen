import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner IN = new Scanner(System.in);
        int N = IN.nextInt();
        int ans = 0;
        for (int i = 1; i <= N; i += 2) {
            if (countY(i) == 8) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static int countY(int x) {
        int result = 0;
        for(int i = 1; i <= x; i++) {
            if (x % i == 0) {
                result++;
            }
        }
        return result;
    }
}
