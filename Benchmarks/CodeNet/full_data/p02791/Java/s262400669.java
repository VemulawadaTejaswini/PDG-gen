import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] P = new int[N];

        for (int i = 0; i < N; i++)
            P[i] = sc.nextInt();

        int min = 999999999;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (min >= P[i]) {
                cnt++;
                min = P[i];
            }
        }

        System.out.println(cnt);

    }
}
