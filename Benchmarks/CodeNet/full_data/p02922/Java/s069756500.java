import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int ans = 0;
            int tap = 1;
            while (true) {
                if (tap >= B) {
                    break;
                }

                tap += A - 1;
                ans++;
            }

            System.out.println(ans);
        }
    }

}
