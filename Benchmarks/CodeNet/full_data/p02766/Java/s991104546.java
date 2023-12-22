import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int ans = 0;
            while (N > 0) {
                N /= K;
                ans++;
            }

            System.out.println(ans);
        }
    }

}
