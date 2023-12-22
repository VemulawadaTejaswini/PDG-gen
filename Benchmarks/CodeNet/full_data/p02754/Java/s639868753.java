import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long s = n % (a + b), t = n / (a + b), sum = 0;
        sum += a * t;
        sum += (s > a)? a:s;
        System.out.println(sum);
    }
}
