import java.util.*;

class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long N = sc.nextLong();
        for (int i = (int)Math.sqrt(N); i > 0; i--) {
            if (N % i == 0) {
                long j = N / i;
                System.out.println(i + j - 2);
                break;
            }
        }
    }
}
