import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int max1 = IntStream.of(A).max().getAsInt();
        int max2 = IntStream.of(A).sorted().limit(A.length-1).max().getAsInt();
        for (int i = 0; i < N; i++) {
            System.out.println(A[i] == max1 ? max2 : max1);
        }
    }
}
