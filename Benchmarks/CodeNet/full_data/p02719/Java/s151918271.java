import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int K = stdIn.nextInt();

        while (N > Math.abs(N-K)) {
            N = Math.abs(N-K);
        }

        System.out.println(N);

    }
}