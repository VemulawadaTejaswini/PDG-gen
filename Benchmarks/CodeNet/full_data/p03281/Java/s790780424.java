import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int r = 0;
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0 && i % j == 0) {
                    sum++;
                }
            }
            if (sum == 8) r++;
        }
        System.out.println(r);
    }
}