import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int max = -1;
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            max = Math.max(a, max);
            total += a;
        }
        int k = sc.nextInt();
        total += (int)Math.pow(2, k) * max;
        total -= max;

        System.out.println(total);
    }
}
