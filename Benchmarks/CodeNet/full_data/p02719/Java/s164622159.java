import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long N = stdIn.nextLong();
        long K = stdIn.nextLong();

        if (K == 1) {
            System.out.println(0);
        } else {
            while (N > Math.abs(N-K)) {
                N = Math.abs(N-K);
            }
    
            System.out.println(N);
        }
    }
}