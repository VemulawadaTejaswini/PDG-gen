import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();

        int[] route = { p, q, r };
        Arrays.sort(route);

        int ans = 0;
        ans += route[0];
        ans += route[1];

        System.out.println(ans);
    }

}
