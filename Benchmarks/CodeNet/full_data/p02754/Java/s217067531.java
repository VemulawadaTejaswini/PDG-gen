import java.util.Scanner;

public class Main {
    static long n;
    static long a;
    static long b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        a = sc.nextLong();
        b = sc.nextLong();
        if (a==0) {
            System.out.println(0);
        } else {
            System.out.println((n/(a+b)*a) + n%(a+b));
        }
    }
}