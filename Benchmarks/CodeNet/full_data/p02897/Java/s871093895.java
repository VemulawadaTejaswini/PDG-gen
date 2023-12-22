import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            System.out.println(N % 2 == 0 ? 0.5 : ((N / 2 + 1) / ((double) N)));
        }
    }
}
