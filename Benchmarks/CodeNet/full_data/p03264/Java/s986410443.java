import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        int cnt = 0;
        for (int i = 2; i <= K; i += 2) {
            for (int j = 1; j <= K; j += 2) {
                cnt++;
            }
        }

        sc.close();

        System.out.println(cnt);
    }
}