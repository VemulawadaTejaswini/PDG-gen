import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        double first = 1.0d/(double) n;

        double res = 0.0d;
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            double zyo = 0.0d;
            while (tmp <= k-1) {
                zyo++;
                tmp *= 2;
            }
//            if (zyo == 0.0d) zyo = 1.0d;
            res += Math.pow(0.5d, zyo);
        }
        System.out.println(res * first);
    }
}
