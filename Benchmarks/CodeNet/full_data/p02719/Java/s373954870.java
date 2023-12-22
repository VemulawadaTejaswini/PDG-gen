import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long N = stdIn.nextLong();
        long K = stdIn.nextLong();

        long min = ((N % K) > Math.abs((N % K) - K)) ?  Math.abs((N % K) - K) : (N % K);

        System.out.println(min);
    }
}