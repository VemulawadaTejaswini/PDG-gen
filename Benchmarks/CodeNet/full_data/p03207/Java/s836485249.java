import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = 0;

        int max = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            p = sc.nextInt();
            total += p;
            max = Math.max(max, p);
        }

        total -= max / 2;
        System.out.println(total);
    }
}
