import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        for(long i = N; i < 10000000; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                break;
            }
        }

    }
    public static boolean isPrime(long N) {
        if(N == 1) return false;
        for(long i = 2; i * i <= N; i++) {
            if(N % i == 0) return false;
        }
        return true;
    }
}
