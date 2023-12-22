import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextLong();
        long mod = n%k;
        System.out.println(Math.min(mod, k-mod));
    }
}
