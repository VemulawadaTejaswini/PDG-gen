
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        long ans = 0;

        if (H == 1 || W == 1) {
            ans = 1;
        } else {
            long oddH = (W + 1) / 2;
            long evenH = W / 2;
            ans += oddH * ((H + 1) / 2);
            ans += evenH * (H / 2);
        }

        System.out.println(ans);

    }

}
