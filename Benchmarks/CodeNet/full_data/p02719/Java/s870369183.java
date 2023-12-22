import java.util.*;
public class Main {
    static final long MODVAL = 998244353L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        if(N > K) {
            long modulo = N / K;
            N -= modulo * K;
        }
        if(N==K) {
            System.out.println("0");
            return;
        }
        System.out.println(String.format("%d", Math.min(Math.abs(N-K), Math.abs(N))));
    }
}
