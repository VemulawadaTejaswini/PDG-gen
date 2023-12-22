import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long K = sc.nextLong();
        long mod = N % K;
        long sub = Math.abs(mod - K);

        System.out.println(Math.min(sub, mod));
    }
}
