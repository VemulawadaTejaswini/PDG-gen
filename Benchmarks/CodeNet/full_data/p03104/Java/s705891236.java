import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(xor(f(a - 1), f(b)));
    }

    static long xor(long a, long b) {
        return a ^ b;
    }

    static long f(long a) {
        long oddCount = (a / 2 - 1);
        int sum = oddCount % 2 == 0 ? 0 : 1;
        return a % 2 == 0 ? sum + a : sum;
    }
}
