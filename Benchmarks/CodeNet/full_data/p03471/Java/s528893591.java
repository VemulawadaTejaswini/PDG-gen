import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                int k = n - i - j;
                int sum = (i * 10000) + (j * 5000) + (k * 1000);
                if(sum == y) {
                    System.out.println(i + " " + j + " " + k);
                    System.exit(0);
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}