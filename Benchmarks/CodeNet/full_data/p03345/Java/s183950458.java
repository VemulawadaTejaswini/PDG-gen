import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        long n = sc.nextInt();
        long h = sc.nextInt();
        long k = sc.nextLong();
        if (k % 2 == 0) System.out.println(t - n);
        else System.out.println(n - t);

    }
}
