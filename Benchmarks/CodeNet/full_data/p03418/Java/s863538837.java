import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());

        if (K == 0) {
            System.out.println(N*N);
            return;
        }

        int count = 0;
        for (int i = K+1; i <= N; i++) {
            count += (i-K)*(N/i) + Math.max((N%i)-K+1, 0);
        }
        System.out.println(count);
    }
}