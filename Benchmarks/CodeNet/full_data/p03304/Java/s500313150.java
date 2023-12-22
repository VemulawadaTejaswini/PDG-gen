import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();


        if (d == 0) {
            System.out.println((m-1) * n / Math.pow(n, 2));
        } else {
            System.out.println((m-1) * (n - d) * 2 / Math.pow(n, 2));
        }

    }
}