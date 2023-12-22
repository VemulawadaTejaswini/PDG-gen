import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int ct = 0;
        for (int i = 0; i < N; i++) {
            ct += (sc.nextInt() >= K)? 1: 0;
        }

        System.out.println(ct);
    }
}