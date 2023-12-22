import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.close();

        long num = n * m;

        long ans = 0;
        if (n == 1 || m == 1) {
            ans = num - 2;
        } else {
            ans = num - n * 2 - m * 2 + 4;
        }
        System.out.println(ans);
    }

}