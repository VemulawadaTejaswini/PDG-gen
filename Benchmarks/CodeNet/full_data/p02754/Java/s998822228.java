import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long q = n / (a + b);
        long r = n % (a + b);
        System.out.println(a * q + Math.min(r, a));
    }

}
