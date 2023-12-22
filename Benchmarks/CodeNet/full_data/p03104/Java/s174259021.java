import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = sc.nextLong();

        long b = sc.nextLong();
        for (long i = ans+1; i <= b; i++) {
            ans ^= i;
        }
        System.out.println(ans);
    }
}