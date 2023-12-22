import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] a = new int[m];
        for (int i = 0 ; i < m ; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0 ; i < m ; i++) {
            sum += a[i];
        }
        System.out.println(Math.max(-1, n - sum));
    }

}
