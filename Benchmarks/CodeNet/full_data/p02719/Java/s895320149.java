import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long N = stdIn.nextLong();
        long K = stdIn.nextLong();

        while (N > Math.abs(N-K)) {
            N = Math.abs(N-K);
        }

        System.out.println(N);

    }
}