import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), K = scan.nextInt(), Q = scan.nextInt();
        int ansR[] = new int[N], cor[] = new int[Q];
        for (int i = 0; i < Q; i++) cor[i] = scan.nextInt();
        for (int i : cor) {
            ansR[i - 1]++;
            for (int j = 0; j < N; j++) ansR[j]--;
        }
        for (int i : ansR) {
            if (i + K <= 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
