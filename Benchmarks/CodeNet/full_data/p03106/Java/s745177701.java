import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int k = in.nextInt();

        int count = 0;
        int ans = 0;
        for (int i = 1; count < k; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
                if (count == k) {
                    ans = i;
                }
            }
        }
        System.out.println(ans);
    }
}
