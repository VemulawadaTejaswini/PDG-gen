import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());

        int count = 0;

        for (int a = K; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                if (a % b >= K) {
                    count++;
                }
            }
        }
        if (K == 0) {
            count -= N;
        }
        System.out.println(count);
    }
}