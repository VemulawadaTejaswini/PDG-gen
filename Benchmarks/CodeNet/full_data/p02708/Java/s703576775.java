import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long count = 0;
        for(long i = k;i <= n + 1;i++) {
            count += (i * (n - i + 1) + 1);
        }
        
        count %= (10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 + 7);
        System.out.println(count);
    }
}
