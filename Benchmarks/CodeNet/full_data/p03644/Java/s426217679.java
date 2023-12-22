import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int max = 0;
        int highest = 1;

        for (int i = 1; i < n + 1; i++) {
            int x = i;
            int ans = 0;
            while (x % 2 == 0) {
                x /= 2;
                ans += 1;
                if (x == 0) {
                    break;
                }
            }
            if (max < ans) {
                max = ans;
                highest = i;
            }
        }
        System.out.print(highest);
    }
}