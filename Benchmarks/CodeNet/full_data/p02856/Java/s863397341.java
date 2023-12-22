import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int m = std.nextInt();
        StringBuilder sb = new StringBuilder();
//        int[] sums = new int[m];
        int sum = 0;
        int baseCount = 0;
        int liftCount = 0;
        for (int i = 0; i < m; i++) {
            int d = std.nextInt();
            int c = std.nextInt();
            baseCount += c;
            int rest = (sum + (d * c)) % 10;
            sum += d *c;
            int lift = sum / 10;
            liftCount += lift;
            sum = sum % 10;
        }
        int ans = baseCount - 1 + liftCount;
        System.out.println(ans);

    }
}