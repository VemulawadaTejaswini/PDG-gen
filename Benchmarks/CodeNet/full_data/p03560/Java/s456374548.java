import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < 10; i++) {
            int cur = K * i;
            int candidate = 0;
            for (int j = 1; j <= 10000000; j *= 10) {
                candidate += cur % (j * 10) / j;
            }
            ans = Math.min(ans, candidate);
        }
        System.out.println(ans);
    }
}
