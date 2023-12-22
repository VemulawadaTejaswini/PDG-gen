import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] L = new int[N];
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (sum <= X) cnt++;
            else break;
            sum += L[i];
        }

        System.out.println(cnt);
    }
}
