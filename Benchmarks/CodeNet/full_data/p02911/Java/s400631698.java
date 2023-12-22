import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int b = q - k;
        int[] r = new int[n];
        for (int i = 0; i < q; i++) {
            r[sc.nextInt() - 1]++;
        }
        IntStream.of(r).mapToObj(ri -> (b < ri) ? "Yes" : "No").forEach(System.out::println);
    }
}
