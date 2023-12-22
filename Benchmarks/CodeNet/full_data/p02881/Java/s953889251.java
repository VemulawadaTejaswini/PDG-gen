import java.util.Scanner;

public class CtestRepJ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long minResult = N - 1;
        for (long i = 1; i <= N; i++) {
            if (N % i == 0) {
                long j = N / i;
                minResult = Math.min(((i - 1) + (j - 1)), minResult);
            }
        }
        System.out.println(minResult);
    }
}
