import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long i = a / x;
        long j = b / x;
        System.out.println(a % x == 0 ? j - i + 1 : j - i);
    }
}