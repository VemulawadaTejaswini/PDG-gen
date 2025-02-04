import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (H <= A && W <= B) {
                ans += 1;
            }
        }

        System.out.println(ans);
    }
}
